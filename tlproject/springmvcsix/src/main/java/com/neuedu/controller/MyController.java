package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping(value="/index",produces = "text/html;charset=utf-8")//请求方式为Get的处理
    @ResponseBody  //json形式显示
    public String index(){
        return "hello,同学们";
    }
}
