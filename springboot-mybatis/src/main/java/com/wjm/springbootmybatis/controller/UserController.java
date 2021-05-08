package com.wjm.springbootmybatis.controller;

import com.wjm.springbootmybatis.entity.User;
import com.wjm.springbootmybatis.service.UserServiceCsv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/springbootMybatis/user")
public class UserController {

    @Autowired
    private UserServiceCsv userServiceCsv;

    @RequestMapping("/getUserInfo")
    public List<User> getUserInfo() {
        return userServiceCsv.getUserInfo();
    }
}
