package com.ifx.server.service;

import cn.hutool.core.util.StrUtil;
import com.google.protobuf.Message;
import com.ifx.connect.connection.ConnectionConstants;
import com.ifx.connect.connection.server.context.IConnectContextAction;
import com.ifx.connect.connection.server.context.ReactorConnection;
import com.ifx.connect.enums.ProtocolMessageMapEnum;
import com.ifx.connect.process.ProtoBufProcess;
import com.ifx.connect.proto.Account;
import com.ifx.connect.spi.netty.ProtoBufProcess;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import reactor.netty.Connection;
@Component
@Slf4j
public class AuthProcessService implements ProtoBufProcess {


    @Autowired
    IConnectContextAction contextAction;

    @Override
    public ProtocolMessageMapEnum type() {
        return ProtocolMessageMapEnum.AUTH;
    }

    @Override
    public void process(@Nullable Connection con, Message message) {

        if (null != message && con != null){

            Account.Authenticate auth = (Account.Authenticate) message;

            Account.AccountInfo accountInfo = auth.getAccountInfo();

            if (con.channel().isActive() && StrUtil.isNotBlank(accountInfo.getAccount())){

                con.channel().attr(ConnectionConstants.BING_ACCOUNT_KEY).set(accountInfo);

                ReactorConnection connection = ReactorConnection.builder()
                        .channel(con.channel())
                        .connection(con)
                        .accountInfo(accountInfo)
                        .build();

                contextAction.putConnection(connection);

                log.info("account :  {} is binding  !",accountInfo.getAccount());

                con.outbound().sendString(Mono.justOrEmpty("Reactor Netty Channel  has been established , network transport now is available！")).then().subscribe();

            }

            return;
        }

        throw  new IllegalArgumentException("The connection and message is invalid!");


    }
}
