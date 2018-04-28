package com.snippet.answertothefight.DTO;

import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: kevin
 * @Date: 2018/4/25 14:07
 * @Description:
 */
@Getter
@Setter
public class CodeMessage {

    public static final CodeMessage SUCCESS = new CodeMessage("100000","响应成功");

    public CodeMessage(String code, String messsage) {
        this.code = code;
        this.messsage = messsage;
    }

    private String code;
    private String messsage;
}
