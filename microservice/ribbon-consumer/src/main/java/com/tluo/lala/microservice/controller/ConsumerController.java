package com.tluo.lala.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by edz on 2017/6/30.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon/user",method = RequestMethod.GET)
    public String getUser(){
        return restTemplate.getForEntity("http://user-service:6703/user/name",String.class).getBody();
    }
}
