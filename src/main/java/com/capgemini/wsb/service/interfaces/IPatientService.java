package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.PatientDto;
import com.capgemini.wsb.dto.VisitDto;

import java.util.List;

public interface IPatientService {
    PatientDto get(Long id);
    PatientDto create(PatientDto dto);
    PatientDto update(PatientDto dto);
    void delete(Long id);
    List<PatientDto> getList();
    List<PatientDto> getListOfPatientByLastName(String lastName);
    List<VisitDto> getListOfPatientsVisits(Long patientId);
    List<PatientDto> getListOfPatientsWithMoreThanXVisits(int numberOfVisit);
    List<PatientDto> getListOfPatientsWithSmallerPeselNumber(Long Pesel);
}
