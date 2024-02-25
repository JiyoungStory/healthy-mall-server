package com.cowork.shoppingmall.domain.user.controller;

import com.cowork.shoppingmall.domain.user.entity.Users;
import com.cowork.shoppingmall.domain.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public List<String> Hello(){
        System.out.println("test");
        return Arrays.asList("서버서버", "뷰뷰");
    }
}