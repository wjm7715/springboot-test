package com.wjm.springbootmybatis.service;

import com.wjm.springbootmybatis.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServiceCsv {

    List<User> getUserInfo();
}
