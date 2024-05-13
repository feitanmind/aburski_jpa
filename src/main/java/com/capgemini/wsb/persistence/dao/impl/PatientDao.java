package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.persistence.dao.interfaces.IPatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDao extends AbstractDao<PatientEntity,Long> implements IPatientDao {
    @Override
    public List<PatientEntity> getAllPatientsWithSpecifiedLastname(String lastName) {
        return entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE p.lastName = :ln",PatientEntity.class)
                .setParameter("ln",lastName)
                .getResultList();
    }
    //Choć napisałem już metodę w VisitDao i uważam że tam ona powinna być
    @Override
    public List<VisitEntity> getAllVisitAssignedToPatient(Long patientId) {
        return entityManager
                .createQuery("SELECT v FROM VisitEntity v WHERE v.patient.id = :pid", VisitEntity.class)
                .setParameter("pid",patientId)
                .getResultList();
    }

    @Override
    public List<PatientEntity> getAllPatientWhoHaveMoreThanXVisits(int numberOfVisits) {
        return entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE p.visits.size > :nov",PatientEntity.class)
                .setParameter("nov",numberOfVisits)
                .getResultList();
    }

    @Override
    public List<PatientEntity> getAllPatientWhoHaveSmallerPeselNumber(Long pesel) {
        return entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE p.peselNumber < :pn",PatientEntity.class)
                .setParameter("pn",pesel)
                .getResultList();
    }
}
