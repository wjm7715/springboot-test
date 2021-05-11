package com.wjm.springbootmybatis.controller;

import com.wjm.springbootmybatis.entity.User;
import com.wjm.springbootmybatis.service.UserServiceCsv;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/springbootMybatis/user")
@Api(tags = "user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserServiceCsv userServiceCsv;

    @ApiOperation(value = "获取用户信息", notes = "获取所有用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public List<User> getUserInfo() {
        logger.info("Controller info: ");
        logger.error("Controller error: ");
        return userServiceCsv.getUserInfo();
    }
}
