package com.wjm.springbootmybatis.impl;

import com.wjm.springbootmybatis.dao.UserMapper;
import com.wjm.springbootmybatis.entity.User;
import com.wjm.springbootmybatis.service.UserServiceCsv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceCsvImpl implements UserServiceCsv{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserInfo() {
        return userMapper.getUserInfo();
    }
}
