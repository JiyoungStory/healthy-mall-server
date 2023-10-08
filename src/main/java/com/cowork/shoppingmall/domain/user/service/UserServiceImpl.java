package com.cowork.shoppingmall.domain.user.service;

import com.cowork.shoppingmall.domain.user.dto.UsersDTO;
import com.cowork.shoppingmall.domain.user.entity.Users;

public interface UserServiceImpl{
    String join(Users users);
}
