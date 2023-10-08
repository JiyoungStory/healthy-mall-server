package com.cowork.shoppingmall.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data            // Getter Setter
@Builder        // DTO -> Entity화
@AllArgsConstructor    // 모든 컬럼 생성자 생성
@NoArgsConstructor
@Table(name = "USERS")
public class Users {

    @Id
    @Column(name = "user_id")
    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
    private boolean isMembership;
    private int userPoint;
    private String userAddr;
    private String userAddrId;
    private String userZipcode;
    private int userState;
    private String userPhone;
    private String createdDate;
}
