package com.tluo.lala.gateway;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by luotong on 2017/6/22.
 */
@SpringCloudApplication
@EnableZuulProxy
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= LaLa Discovery Service Start Success =============");
    }
}
