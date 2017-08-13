package com.tluo.lala.microservice.users.domain;

import com.tluo.lala.commons.base.BaseDomain;
import lombok.Data;

/**
 * Created by edz on 2017/8/11.
 */
@Data
public class User extends BaseDomain{
    private String username;
    private String password;
    private String name;
    private String mobile;
    private int age;
    private int gender;
    private String hobby;
    private String address;
}
