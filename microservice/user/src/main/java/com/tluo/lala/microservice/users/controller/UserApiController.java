package com.tluo.lala.microservice.users.controller;

import com.tluo.lala.commons.object.R;
import com.tluo.lala.microservice.users.domain.User;
import com.tluo.lala.microservice.users.service.UserApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by edz on 2017/6/23.
 */
@RestController
@RequestMapping("/user")
@RefreshScope //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class UserApiController {

    @Autowired
    private UserApiService userApiService;

    @Value("${user.name}")
    private String uname;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    @ApiOperation(value = "用户姓名", notes = "查询用户的姓名")
    public String get() {
        return this.uname;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User find(@PathVariable("id") long id){
        return userApiService.findById(id);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ApiOperation(value = "注册用户", notes = "注册用户")
    public R save(@RequestBody User user){
        User u = userApiService.findByUserName(user.getUsername());
        if (u != null) {
            return R.error("用户名已存在");
        }
        userApiService.registry(user);
        return R.ok();
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<User> list(){
        return userApiService.findAll();
    }
}
