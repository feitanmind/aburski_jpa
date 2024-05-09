package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.MedicalTreatmentDto;

import java.util.List;

public interface IMedicalTreatementService {
    MedicalTreatmentDto get(Long id);
    MedicalTreatmentDto create(MedicalTreatmentDto dto);
    MedicalTreatmentDto update(MedicalTreatmentDto dto);
    void delete(Long id);
    List<MedicalTreatmentDto> getList();
}
