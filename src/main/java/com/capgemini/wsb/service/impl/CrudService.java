package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.mapper.IMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IDao;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;

public abstract class CrudService<DTO,ID extends Serializable,E,MAP extends IMapper<DTO,E>, DAO extends IDao<E,ID>>{

    protected final MAP mapper;
    protected final DAO dao;

    protected CrudService(DAO dao,MAP mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    public DTO create(DTO dto) {
        E entity = mapper.mapToAddEntity(dto);
        dao.save(entity);
        return dto;
    }

    public DTO get(ID id) {
        E entity = dao.findOne(id);
        return mapper.mapToDto(entity);
    }

    public DTO update(DTO dto) {
        E entity = mapper.mapToEntity(dto);
        dao.update(entity);
        return dto;
    }

    public void delete(ID id) {
        dao.delete(id);
    }
}
