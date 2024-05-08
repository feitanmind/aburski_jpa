package com.capgemini.wsb.mapper;

public abstract class AbstractMapper<E, D> {
    E mapToEntity(D dto)
    {
        return null;
    }
    D mapToDto(E entity)
    {
        return null;
    }
}
