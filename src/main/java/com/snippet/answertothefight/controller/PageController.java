package com.snippet.answertothefight.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: kevin
 * @Date: 2018/4/25 15:32
 * @Description:
 */
@Controller
public class PageController {

    @ApiOperation(value="进入页面",notes = "")
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value="hello",method = RequestMethod.POST)
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
