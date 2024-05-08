package com.capgemini.wsb.mapper;

public interface IMapper<I,E> {
    I mapToDto(E entity);
    E mapToEntity(I dto);
    E mapToAddEntity(I dto);
}
