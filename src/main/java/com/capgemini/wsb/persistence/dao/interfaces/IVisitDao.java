package com.capgemini.wsb.persistence.dao.interfaces;

import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface IVisitDao extends IDao<VisitEntity,Long> {
    List<VisitEntity> getAllVisitsForDoctor(Long id);
    List<VisitEntity> getAllVisitsForPatient(Long id);
}
