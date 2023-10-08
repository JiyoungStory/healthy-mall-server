package com.cowork.shoppingmall.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data            // Getter Setter
@Builder        // DTO -> Entity화
@AllArgsConstructor    // 모든 컬럼 생성자 생성
@NoArgsConstructor
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
