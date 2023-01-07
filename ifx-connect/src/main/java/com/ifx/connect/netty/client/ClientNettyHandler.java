package com.ifx.connect.netty.client;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.ifx.connect.connection.client.ClientAction;
import com.ifx.connect.task.TaskManager;
import com.ifx.connect.proto.Protocol;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javafx.application.Platform;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;

@Slf4j
@Component
@ChannelHandler.Sharable
public class ClientNettyHandler extends SimpleChannelInboundHandler<Protocol> implements  ApplicationListener<ContextRefreshedEvent> {
//    @Resource(name = "clientPool")
    private ExecutorService clientServer;
//    @Resource
    private ClientAction clientAction;
//    @Resource
    private TaskManager taskManager;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        clientServer = SpringUtil.getBean("clientPool");
//        clientAction = SpringUtil.getBean(ClientAction.class);
//        taskManager = SpringUtil.getBean(TaskManager.class);
    }

    public void init(){
//        TODO 重新梳理
        if (clientServer==null)
        clientServer = SpringUtil.getBean("clientPool");
        if (clientAction==null)
        clientAction = SpringUtil.getBean(ClientAction.class);
        if (taskManager==null)
        taskManager = SpringUtil.getBean(TaskManager.class);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Protocol byteBuf) throws Exception {
        /**
         * @Description  处理接收到的消息
         **/
//        log.info("receive msg from server-side {} , data package {}",ctx.channel().localAddress().toString(),byteBuf);
        log.info("receive msg from server-side {}",ctx.channel().localAddress().toString());

        init();
        log.info("received msg package {}",byteBuf);
        clientServer.submit(() -> Platform.runLater(()-> taskManager.doTask(byteBuf)));
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception
    {
        /**
         * @Description  处理I/O事件的异常
         **/
        log.error(ExceptionUtil.getMessage(cause));
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        log.info("【netty】 已连接 Server host{}" ,ctx.channel().remoteAddress().toString());
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
    }
}
