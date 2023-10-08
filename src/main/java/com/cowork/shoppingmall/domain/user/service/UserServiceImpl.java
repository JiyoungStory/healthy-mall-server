package com.cowork.shoppingmall.domain.user.service;

import com.cowork.shoppingmall.domain.user.dto.UsersDTO;

public interface UserServiceImpl{
    Long join(UsersDTO usersDTO);
}
