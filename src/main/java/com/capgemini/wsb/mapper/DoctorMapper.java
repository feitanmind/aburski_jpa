package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorDto;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public class DoctorMapper extends AbstractMapper<DoctorEntity, DoctorDto> {
    @Override
    DoctorEntity mapToEntity(DoctorDto dto)
    {
        if(dto == null) return null;
        DoctorEntity entity = new DoctorEntity();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setTelephoneNumber(dto.getTelephoneNumber());
        entity.setEmail(dto.getEmail());
        entity.setDoctorNumber(dto.getDoctorNumber());
        entity.setSpecialization(dto.getSpecialization());
        return entity;
    }
    @Override
    DoctorDto mapToDto(DoctorEntity entity)
    {
        if(entity == null) return null;
        return new DoctorDto(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getTelephoneNumber(),
                entity.getDoctorNumber(),
                entity.getSpecialization()
        );
    }
}
