package com.tluo.lala.commons.base;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by edz on 2017/8/13.
 */
@Component
public interface BaseDao<T> {
    T findById(Long id);
    List<T> findAll();
    long create(T t);
    int update(T t);
    int deleteById(Long id);
    int deleteByObject(T t);
}
