package com.capgemini.wsb.persistence.dao.interfaces;

import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface IPatientDao extends IDao<PatientEntity, Long>{
    /**
     * Get List of Patient Entity with specified LastName
     * @param lastName
     * @return List(PatientEntity)
     */
    List<PatientEntity> getAllPatientsWithSpecifiedLastname(String lastName);

    /**
     * Get List Of Visits Assigned to patient with passed id
     * @param patientId
     * @return List of VisitEntity
     */
    List<VisitEntity> getAllVisitAssignedToPatient(Long patientId);

    /**
     * Get List of Patients With more than passed number of visits
     * @param numberOfVisits
     * @return List of PatientEntity
     */
    List<PatientEntity> getAllPatientWhoHaveMoreThanXVisits(int numberOfVisits);

    /**
     * Get List of Patients with smaller Pesel Number
     * @param pesel
     * @return List of PatientEntity
     */
    List<PatientEntity> getAllPatientWhoHaveSmallerPeselNumber(Long pesel);
}
