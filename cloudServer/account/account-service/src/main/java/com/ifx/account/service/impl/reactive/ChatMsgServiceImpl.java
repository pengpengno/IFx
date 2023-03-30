package com.ifx.account.service.impl.reactive;

import com.ifx.account.bo.ChatMsgBo;
import com.ifx.account.mapstruct.ChatMsgMapper;
import com.ifx.account.repository.ChatMsgRepository;
import com.ifx.account.service.ChatMsgService;
import com.ifx.account.vo.ChatMsgVo;
import com.ifx.common.utils.ValidatorUtil;
import com.ifx.connect.proto.Chat;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
* @author HP
* @description 针对表【chat_msg(信息表)】的数据库操作Service实现
* @createDate 2023-01-16 16:52:17
*/
@Service
public class ChatMsgServiceImpl  implements ChatMsgService {

    @Autowired
    ChatMsgRepository chatMsgRepository;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value(value = "${chat.push.queue:chat.push.queue}")
    String chatMessageQueue ;

    @Value(value = "${chat.message.exchange:chat.message.exchange}")
    String chatMessageExchange ;

    @Value(value = "${chat.message.routeKey:chat.message.push}")
    String chatMessageRouteKey ;


    @Override
    public Mono<Void> pushMsg(ChatMsgBo chatMsgBo) {
        Chat.ChatMessage chatMessage = ChatMsgMapper.INSTANCE.chatBo2ProtoChat(chatMsgBo);
        rabbitTemplate.send(chatMessageExchange,chatMessageRouteKey,new Message(chatMessage.toByteArray()));
        return Mono.empty();

    }


    @Override
    public Mono<Long> saveMsgReadPattern(ChatMsgVo chatMsgVo) {
        return Mono.justOrEmpty(Optional.ofNullable(chatMsgVo))
                .doOnNext(e-> ValidatorUtil.validateThrows(e, ChatMsgVo.ChatPush.class))
                .map(ChatMsgMapper.INSTANCE::unSentMsg)
                .flatMap(e-> chatMsgRepository.save(e))
                .map(e->e.getId())
                ;
    }

    @Override
    public Mono<Boolean> chat(ChatMsgVo chatMsgVo) {
        return null;
    }




    @Override
    public Mono<Long> saveMsgWritePattern(ChatMsgVo chatMsgVo) {
        return null;
    }
}




