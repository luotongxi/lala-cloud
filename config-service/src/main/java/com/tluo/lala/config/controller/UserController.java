package com.tluo.lala.config.controller;

import com.tluo.lala.config.conf.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edz on 2017/6/22.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private User user;

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String getUserName(){
        System.out.println(user.getPassword());
        return user.getPassword() + user.getUsername();
    }
}
