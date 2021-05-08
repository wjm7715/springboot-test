package com.wjm.springbootmybatis.entity;

import lombok.Data;


@Data
public class User {
    private String city;
    private String county;
    private String userLogin;
    private String userPass;
    private String userNickname;
    private String mobile;
}
