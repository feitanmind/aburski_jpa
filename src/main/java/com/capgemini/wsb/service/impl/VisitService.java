package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.mapper.VisitMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IVisitDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.interfaces.IVisitService;
import org.springframework.stereotype.Service;

@Service
public class VisitService extends CrudService<VisitDto, Long, VisitEntity, VisitMapper, IVisitDao> implements IVisitService {

    protected VisitService(IVisitDao dao) {
        super(dao, new VisitMapper());
    }
}
