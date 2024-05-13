package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.mapper.VisitMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IVisitDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.interfaces.IVisitService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VisitService extends CrudService<VisitDto, Long, VisitEntity, VisitMapper, IVisitDao> implements IVisitService {

    protected VisitService(IVisitDao dao) {
        super(dao, new VisitMapper());
    }

    public List<VisitDto> getListForPatient(Long id) {

        List<VisitEntity> visitEntities = dao.getAllVisitsForPatient(id);
        List<VisitDto> visitDtoList = new ArrayList<>();
        visitEntities.forEach(en -> visitDtoList.add(mapper.mapToDto(en)));
        return visitDtoList;
    }

    public List<VisitDto> getListForDoctor(Long id) {
        List<VisitEntity> visitEntities = dao.getAllVisitsForDoctor(id);
        List<VisitDto> visitDtoList = new ArrayList<>();
        visitEntities.forEach(en -> visitDtoList.add(mapper.mapToDto(en)));
        return visitDtoList;
    }
}
