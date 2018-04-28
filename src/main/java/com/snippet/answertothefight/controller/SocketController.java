package com.snippet.answertothefight.controller;

import com.snippet.answertothefight.DTO.ClientMessage;
import com.snippet.answertothefight.DTO.CodeMessage;
import com.snippet.answertothefight.DTO.ServerMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * @Auther: kevin
 * @Date: 2018/4/25 13:57
 * @Description:
 */
@Controller
public class SocketController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SimpMessagingTemplate template;

    // 点对点聊天
    @MessageMapping("/answer")
    @SendTo("/topic/answer")
    public ServerMessage chat(ClientMessage message){
        return new ServerMessage(CodeMessage.SUCCESS,"成功");
    }

    // 群聊天
    @MessageMapping("/notice")
    public ServerMessage notice(ClientMessage message) {
        // 发送消息给订阅 "/topic/notice" 且在线的用户
        return new ServerMessage(CodeMessage.SUCCESS,"成功");
    }




}
