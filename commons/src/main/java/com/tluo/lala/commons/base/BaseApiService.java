package com.tluo.lala.commons.base;

import java.util.List;

/**
 * Created by edz on 2017/8/13.
 */
public abstract class BaseApiService<T> {
    protected abstract BaseDao<T> getDao();

    public T findById(long id) {
        return this.getDao().findById(id);
    }

    public List<T> findAll() {
        return this.getDao().findAll();
    }

    public long save(T t) {
        return this.getDao().create(t);
    }

    public int update(T t) {
        return this.getDao().update(t);
    }

    public int deleteById(Long id) {
        return this.getDao().deleteById(id);
    }

    public int deleteByObject(T t) {
        return this.getDao().deleteByObject(t);
    }
}
