package com.tluo.lala.discovery.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by edz on 2017/6/22.
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    private String name;
    private String age;
}
