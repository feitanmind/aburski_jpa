package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientDto;
import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.mapper.VisitMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IPatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.interfaces.IPatientService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PatientService extends CrudService<PatientDto,Long, PatientEntity, PatientMapper, IPatientDao> implements IPatientService {

    public PatientService(IPatientDao dao) {
        super(dao, new PatientMapper());
    }

    public List<PatientDto> getListOfPatientByLastName(String lastName) {
        List<PatientEntity> patientEntityList = dao.getAllPatientsWithSpecifiedLastname(lastName);
        return patientEntityList.stream().map(mapper::mapToDto).collect(Collectors.toList());
    }

    public List<VisitDto> getListOfPatientsVisits(Long patientId) {
        List<VisitEntity> patientsVisitsEntity = dao.getAllVisitAssignedToPatient(patientId);
        VisitMapper vm = new VisitMapper();
        return patientsVisitsEntity.stream().map(vm::mapToDto).collect(Collectors.toList());
    }

    public List<PatientDto> getListOfPatientsWithMoreThanXVisits(int numberOfVisits) {
        List<PatientEntity> patientEntityList = dao.getAllPatientWhoHaveMoreThanXVisits(numberOfVisits);
        return patientEntityList.stream().map(mapper::mapToDto).collect(Collectors.toList());
    }

    public List<PatientDto> getListOfPatientsWithSmallerPeselNumber(Long pesel) {
        List<PatientEntity> patientEntityList = dao.getAllPatientWhoHaveSmallerPeselNumber(pesel);
        return patientEntityList.stream().map(mapper::mapToDto).collect(Collectors.toList());
    }
}
