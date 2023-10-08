package com.cowork.shoppingmall.domain.user.controller;

import com.cowork.shoppingmall.domain.user.entity.Users;
import com.cowork.shoppingmall.domain.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor

public class UserController {
    private final UserServiceImpl userServiceImpl;

    @GetMapping("/join")
    public String createMemberForm() {

        return "join";
    }

    @RequestMapping(value = "/joinForm")
    public String createMember(Users Users) {
        String memberId = userServiceImpl.join(Users);
        return "join";
    }
}
