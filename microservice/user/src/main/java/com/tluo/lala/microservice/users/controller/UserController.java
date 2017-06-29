package com.tluo.lala.microservice.users.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edz on 2017/6/23.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/lala",method = RequestMethod.GET)
    public String get(){
        return "user service lala";
    }
}
