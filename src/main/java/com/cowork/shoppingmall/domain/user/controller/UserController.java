package com.cowork.shoppingmall.domain.user.controller;

import com.cowork.shoppingmall.domain.user.dto.UsersDTO;
import com.cowork.shoppingmall.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @GetMapping("/join")
    public String createMemberForm() {

        return "login";
    }

    @PostMapping("/join")
    public String createMember(UsersDTO usersDTO) {
        String memberId = userService.join(usersDTO);
        return "index";
    }
}
