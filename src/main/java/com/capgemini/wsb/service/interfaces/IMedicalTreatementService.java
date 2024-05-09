package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.MedicalTreatmentDto;

public interface IMedicalTreatementService {
    MedicalTreatmentDto findById(final Long id);
    MedicalTreatmentDto get(Long id);
    MedicalTreatmentDto create(MedicalTreatmentDto dto);
    MedicalTreatmentDto update(MedicalTreatmentDto dto);
    void delete(Long id);
}
