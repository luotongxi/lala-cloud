package com.tluo.lala.microservice.users.controller;

import com.tluo.lala.microservice.users.domain.User;
import com.tluo.lala.microservice.users.service.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edz on 2017/9/7.
 */
@RestController
public class LoginApiController {

    @Autowired
    private UserApiService userApiService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public int login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        User userInDb = userApiService.findByUserName(username);
        if (userInDb != null && userInDb.getPassword().equals(password)) {
            return 1;
        }else if(userInDb == null){
            return -1;
        }
        return 0;
    }
}
