package com.wjm.springbootmybatis.impl;

import com.wjm.springbootmybatis.dao.UserMapper;
import com.wjm.springbootmybatis.entity.User;
import com.wjm.springbootmybatis.service.UserServiceCsv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceCsvImpl implements UserServiceCsv{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceCsvImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserInfo() {
        logger.info("ServiceImpl info: ");
        logger.error("ServiceImpl error: ");
        return userMapper.getUserInfo();
    }
}
