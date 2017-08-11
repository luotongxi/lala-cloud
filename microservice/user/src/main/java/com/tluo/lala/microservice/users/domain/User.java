package com.tluo.lala.microservice.users.domain;

import lombok.Data;

/**
 * Created by edz on 2017/8/11.
 */
@Data
public class User {
    private long userId;
    private String username;
    private String mobile;
}
