package com.ifx.server.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.InetSocketAddress;

@Component("nettyServer")
@Slf4j
public class StartNettyServer {

    @Resource
    private ServerHandler serverHandler;
    //配置服务端NIO线程组
    private final EventLoopGroup parentGroup = new NioEventLoopGroup(); //NioEventLoopGroup extends MultithreadEventLoopGroup Math.max(1, SystemPropertyUtil.getInt("io.netty.eventLoopThreads", NettyRuntime.availableProcessors() * 2));
    private final EventLoopGroup childGroup = new NioEventLoopGroup();
    private Channel channel;
    public ChannelFuture bind(InetSocketAddress address) {
        ChannelFuture channelFuture = null;
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(parentGroup, childGroup)
                    .channel(NioServerSocketChannel.class)    //非阻塞模式
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childHandler(serverHandler);
            channelFuture = b.bind(address).syncUninterruptibly();

            channel = channelFuture.channel();
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            if (null != channelFuture && channelFuture.isSuccess()) {
                log.info("netty server start done. ");
            } else {
                log.error("netty server start error. ");
            }
        }
        return channelFuture;
    }
    public void destroy() {
        if (null == channel) return;
        channel.close();
        parentGroup.shutdownGracefully();
        childGroup.shutdownGracefully();
    }
    public Channel getChannel() {
        return channel;
    }



}
