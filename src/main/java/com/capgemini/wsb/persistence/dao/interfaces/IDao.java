package com.capgemini.wsb.persistence.dao.interfaces;

import java.io.Serializable;
import java.util.List;

public interface IDao<T, K extends Serializable> {

    T save(T entity);

    T getOne(K id);

    T findOne(K id);

    List<T> findAll();

    T update(T entity);

    void delete(T entity);

    void delete(K id);

    void deleteAll();

    long count();

    boolean exists(K id);
}
