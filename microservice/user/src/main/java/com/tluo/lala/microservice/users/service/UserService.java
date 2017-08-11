package com.tluo.lala.microservice.users.service;

import com.tluo.lala.microservice.users.dao.UserDao;
import com.tluo.lala.microservice.users.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by edz on 2017/8/11.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findById (long id) {
        return userDao.findById(id);
    }
}
