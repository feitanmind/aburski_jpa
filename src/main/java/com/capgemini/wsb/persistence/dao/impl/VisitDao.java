package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.interfaces.IVisitDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class VisitDao extends AbstractDao<VisitEntity,Long> implements IVisitDao {
    @Override
    public List<VisitEntity> getAllVisitsForDoctor(Long id) {
         Query q = entityManager
                 .createQuery("SELECT v FROM VisitEntity  v WHERE v.doctor.id = :doctorId",VisitEntity.class)
                 .setParameter("doctorId", id);

        return q.getResultList();
    }

    @Override
    public List<VisitEntity> getAllVisitsForPatient(Long id) {
        Query q = entityManager
                .createQuery("SELECT v FROM VisitEntity v WHERE v.patient.id = :patientId",VisitEntity.class)
                .setParameter("patientId",id);
        return q.getResultList();
    }
}
