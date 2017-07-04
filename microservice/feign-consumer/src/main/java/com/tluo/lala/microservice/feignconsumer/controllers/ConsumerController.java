package com.tluo.lala.microservice.feignconsumer.controllers;

import com.tluo.lala.microservice.feignconsumer.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edz on 2017/7/4.
 */
@RestController
public class ConsumerController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/feign/user/name",method = RequestMethod.GET)
    public String getUser(){
        return userClient.getUser();
    }
}
