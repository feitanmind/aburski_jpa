package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.PatientDto;

public interface IPatientService {
    PatientDto findById(final Long id);
    PatientDto get(Long id);
    PatientDto create(PatientDto dto);
    PatientDto update(PatientDto dto);
    void delete(Long id);
}
