package com.ifx.account.service;


import com.ifx.account.vo.session.SessionAccountVo;
import com.ifx.account.vo.session.SessionInfoVo;
import com.ifx.common.base.AccountInfo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/***
 * 会话生命周期
 */
public interface ISessionLifeStyle {

    Mono<SessionInfoVo> init(String name);


    Flux<Long> addAccount (SessionAccountVo sessionAccountVo);


    /**
     * 查询 session 下的 用户信息
     * @param sessionId 会话id
     * @return 会话下的用户信息
     */
    Mono<SessionAccountVo>  sessionAccountInfo(Long sessionId);


    public Flux<AccountInfo> checkOnlineUserBySessionId(Long sessionId);







}
