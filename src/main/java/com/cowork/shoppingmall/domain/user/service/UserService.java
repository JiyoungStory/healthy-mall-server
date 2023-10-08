package com.cowork.shoppingmall.domain.user.service;

import com.cowork.shoppingmall.domain.user.dto.UsersDTO;
import com.cowork.shoppingmall.domain.user.entity.Users;
import com.cowork.shoppingmall.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    //생성자 주입
    private final UserRepository userRepository;

    public String join(UsersDTO usersDTO){
        Users users = Users.builder().userId(usersDTO.getUserId())
                .userName(usersDTO.getUserName())
                .build();
        return userRepository.save(users).getUserId();
    }
}
