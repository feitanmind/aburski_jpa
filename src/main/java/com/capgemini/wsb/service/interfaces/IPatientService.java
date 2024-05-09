package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.PatientDto;

import java.util.List;

public interface IPatientService {
    PatientDto get(Long id);
    PatientDto create(PatientDto dto);
    PatientDto update(PatientDto dto);
    void delete(Long id);
    List<PatientDto> getList();
}
