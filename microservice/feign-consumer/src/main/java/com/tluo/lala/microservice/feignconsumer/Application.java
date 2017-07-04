package com.tluo.lala.microservice.feignconsumer;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by luotong on 2017/6/23.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= LaLa Feign Consumer Service Start Success =============");
    }
}
