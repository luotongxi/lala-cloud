package com.tluo.lala.microservice.feignconsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by edz on 2017/7/4.
 */
@FeignClient(value = "user-service",fallback = UserClientHystrix.class)
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/name")
    String getUser ();
}
