package com.tluo.lala.microservice.users.controller;

import com.tluo.lala.microservice.users.domain.User;
import com.tluo.lala.microservice.users.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edz on 2017/6/23.
 */
@RestController
@RequestMapping("/user")
@RefreshScope //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${user.name}")
    private String uname;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    @ApiOperation(value = "用户姓名", notes = "查询用户的姓名")
    public String get() {
        return this.uname;
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public User findById(@PathVariable("userId") long userId){
        return userService.findById(userId);
    }
}
