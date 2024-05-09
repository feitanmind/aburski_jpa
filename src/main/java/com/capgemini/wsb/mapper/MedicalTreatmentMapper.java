package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.MedicalTreatmentDto;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;

public class MedicalTreatmentMapper implements IMapper<MedicalTreatmentDto, MedicalTreatmentEntity> {

    public MedicalTreatmentDto mapToDto(MedicalTreatmentEntity entity) {
        if(entity == null) return null;
        return new MedicalTreatmentDto(entity.getId(),entity.getDescription(),entity.getType());
    }

    public MedicalTreatmentEntity mapToEntity(MedicalTreatmentDto dto) {
        MedicalTreatmentEntity medicalTreatmentEntity = new MedicalTreatmentEntity();
        medicalTreatmentEntity.setId(dto.getId());
        medicalTreatmentEntity.setDescription(dto.getDescription());
        medicalTreatmentEntity.setType(dto.getType());
        return medicalTreatmentEntity;
    }

    public MedicalTreatmentEntity mapToAddEntity(MedicalTreatmentDto dto) {
        MedicalTreatmentEntity medicalTreatmentEntity = mapToEntity(dto);
        medicalTreatmentEntity.setId(null);
        return  medicalTreatmentEntity;
    }
}
