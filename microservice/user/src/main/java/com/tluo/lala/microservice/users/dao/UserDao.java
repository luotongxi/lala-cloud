package com.tluo.lala.microservice.users.dao;

import com.tluo.lala.microservice.users.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by edz on 2017/8/11.
 */
@Repository
public interface UserDao {
    User findById(@Param("userId") long userId);
}
