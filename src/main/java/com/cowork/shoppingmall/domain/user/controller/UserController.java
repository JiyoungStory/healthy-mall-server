package com.cowork.shoppingmall.domain.user.controller;

import com.cowork.shoppingmall.domain.user.dto.UsersDTO;
import com.cowork.shoppingmall.domain.user.entity.Users;
import com.cowork.shoppingmall.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @GetMapping("/join")
    public String createMemberForm() {

        return "join";
    }

    @RequestMapping(value = "/joinForm")
    public String createMember(Users Users) {
        String memberId = userService.join(Users);
        return "join";
    }
}
