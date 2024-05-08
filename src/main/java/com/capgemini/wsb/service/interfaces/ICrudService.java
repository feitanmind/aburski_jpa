package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.mapper.AbstractMapper;

import java.io.Serializable;

public interface ICrudService<D,I extends Serializable,E> {
    D crete(D dto, AbstractMapper<D,E> mapper);
    D get(I id, AbstractMapper<E,D> mapper);
    D update(D dto, AbstractMapper<D,E> mapper);
    void delete(I id);
}
