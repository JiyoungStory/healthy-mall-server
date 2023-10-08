package com.cowork.shoppingmall.domain.user.service;

import com.cowork.shoppingmall.domain.user.dto.UsersDTO;
import com.cowork.shoppingmall.domain.user.entity.Users;
import com.cowork.shoppingmall.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceImpl{

    //생성자 주입
    private final UserRepository userRepository;

    @Override
    public String join(Users Users){
        Users users = Users.builder().userId(Users.getUserId())
                .userPw(Users.getUserPw())
                .userName(Users.getUserName())
                .userEmail(Users.getUserEmail())
                .build();
        return userRepository.save(users).getUserId();
    }
}
