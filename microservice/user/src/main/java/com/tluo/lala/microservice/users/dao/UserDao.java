package com.tluo.lala.microservice.users.dao;

import com.tluo.lala.commons.base.BaseDao;
import com.tluo.lala.microservice.users.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by edz on 2017/8/11.
 */
@Repository
public interface UserDao extends BaseDao{
    User findById(@Param("id") long id);
}
