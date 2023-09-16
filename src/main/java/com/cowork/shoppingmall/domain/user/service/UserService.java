package com.cowork.shoppingmall.domain.user.service;

public interface UserService {

    default boolean login() {
        return false;
    }
}
