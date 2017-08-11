package com.tluo.lala.config.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by edz on 2017/6/22.
 */
@ConfigurationProperties(prefix = "user")
@Component
@Data
public class User {
    private long id;
    private String username;
    private String password;
}
