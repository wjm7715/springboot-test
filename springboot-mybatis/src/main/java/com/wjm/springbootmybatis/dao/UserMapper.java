package com.wjm.springbootmybatis.dao;

import com.wjm.springbootmybatis.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> getUserInfo();
}
