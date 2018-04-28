package com.snippet.answertothefight.DTO;

import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: kevin
 * @Date: 2018/4/25 13:54
 * @Description:
 */
@Getter
@Setter
public class ServerMessage {

    public ServerMessage(CodeMessage codeMessage, String data) {
        this.codeMessage = codeMessage;
        this.data = data;
    }

    private CodeMessage codeMessage;
    private String data;
}
