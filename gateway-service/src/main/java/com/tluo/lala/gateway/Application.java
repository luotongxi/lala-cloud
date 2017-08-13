package com.tluo.lala.gateway;

import com.tluo.lala.gateway.zuulFilters.AccessFilter;
import com.tluo.lala.gateway.zuulFilters.ErrorFilter;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by luotong on 2017/6/22.
 */
@SpringCloudApplication
@EnableZuulProxy // 开启Zuul
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("============= LaLa Discovery Service Start Success =============");
    }

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

    @Bean
    public ErrorFilter errorFilter(){
        return new ErrorFilter();
    }
}
