package com.ifx.account.service.impl.reactive;

import cn.hutool.core.util.IdUtil;
import com.ifx.account.mapstruct.SessionMapper;
import com.ifx.account.repository.SessionRepository;
import com.ifx.account.service.reactive.ReactiveAccountService;
import com.ifx.account.service.reactive.SessionService;
import com.ifx.account.vo.session.SessionInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.function.Supplier;

/**
* @author HP
* @description 针对表【session(会话表)】的数据库操作Service实现
* @createDate 2022-09-28 16:23:47
*/
@Service
@Slf4j
public class SessionServiceImpl implements SessionService {


    @Autowired
    private R2dbcEntityTemplate r2dbcEntityTemplate;

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private ReactiveAccountService accountService;

    @Override
    public Mono<Long> post2Session(SessionInfoVo sessionInfoVo) {
        return Mono.just(sessionInfoVo)
            .map(SessionMapper.INSTANCE::vo2Session)
                .flatMap(session ->{
                    Supplier<Long> id = session.getId() == null? () -> {
                        session.setId(IdUtil.getSnowflakeNextId());
                        r2dbcEntityTemplate.insert(session);
                        return session.getId();
                    } : ()-> {
                        r2dbcEntityTemplate.update(session);
                        return session.getId();
                    };
                    return Mono.just(id.get());
                });
    }

    public Mono<SessionInfoVo> selectSession(Long sessionId){
        return sessionRepository.findById(sessionId).map(SessionMapper.INSTANCE::session2Vo);
    }


    /**
     * 查询 session 配置 及其 创建者信息
     * @param sessionId
     * @return
     */
    public Mono<SessionInfoVo> selectSessionWithinCreator(Long sessionId){
        return selectSession(sessionId).flatMap(l-> {
            Long userId = l.getCreateInfo().getUserId();
            return accountService.findByUserId(userId).map(e-> {
                l.setCreateInfo(e);
                return l;
            });
        });
    }
}




