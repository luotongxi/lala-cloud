package com.tluo.lala.microservice.feignconsumer.feign;

import org.springframework.stereotype.Component;

/**
 * Created by edz on 2017/7/6.
 */
@Component
public class UserClientHystrix implements UserClient{
    @Override
    public String getUser() {
        return "user-service UserController error";
    }
}
