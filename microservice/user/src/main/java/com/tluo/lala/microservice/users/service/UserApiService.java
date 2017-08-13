package com.tluo.lala.microservice.users.service;

import com.tluo.lala.commons.base.BaseApiService;
import com.tluo.lala.commons.base.BaseDao;
import com.tluo.lala.microservice.users.dao.UserDao;
import com.tluo.lala.microservice.users.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by edz on 2017/8/11.
 */
@Service
public class UserApiService extends BaseApiService<User>{
    @Autowired
    private UserDao userDao;

    @Override
    protected BaseDao<User> getDao() {
        return this.userDao;
    }

    public User findById (long id) {
        return userDao.findById(id);
    }

    @Override
    public long save(User user) {
        if (user != null) {
            return userDao.create(user);
        }
        return 0;
    }
}
