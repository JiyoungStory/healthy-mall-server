package com.cowork.shoppingmall.domain.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
    private boolean isMembership;
    private int userPoint;
    private String userAddr;
    private String userAddrId;
    private String userZipCode;
    private int userState;
    private String userPhone;
    private String createdDate;
}
