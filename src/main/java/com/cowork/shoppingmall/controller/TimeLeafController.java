package com.cowork.shoppingmall.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TimeLeafController {

    @RequestMapping("/index")
    public String index(){
        return "/index.html";
    }
}
