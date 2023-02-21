package com.ifx.client.service;

import cn.hutool.core.util.IdUtil;
import com.ifx.common.constant.CommonConstant;
import com.ifx.connect.connection.client.ClientAction;
import com.ifx.connect.proto.Protocol;
import com.ifx.connect.task.TaskManager;
import com.ifx.connect.task.handler.TaskHandler;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

/**
 *
 * @see ClientAction
 * 客户端服务
 */
@Service
@Slf4j
@Deprecated
public class ClientService {

//    @Resource
    private ClientAction clientAction;

//    @Resource
    private TaskManager taskManager = TaskManager.getInstance();


    /**
     * <P>客户端发送通讯协议包{@link Protocol}
     * 并将{@link TaskHandler } 存入 {@link TaskManager } 任务管理池中
     * @param protocol 协议包
     * @param taskHandler 任务回调执行基本单元
     */
    @Deprecated
    public void send(Protocol protocol, TaskHandler taskHandler){
//       保存 TaskHandler等待回调
        String trace = IdUtil.fastSimpleUUID();
        log.debug("生成的 trace 为 {}",trace);
        MDC.put(CommonConstant.CLIENT_TRACE,trace);
        protocol.setClientTrace(trace);
        taskManager.addTask(trace,taskHandler);
    }

    public void defaultSend(){

    }

}
