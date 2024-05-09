package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorDto;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public class DoctorMapper implements IMapper<DoctorDto,DoctorEntity> {

    public final AddressMapper addressMapper = new AddressMapper();
    public DoctorEntity mapToEntity(DoctorDto dto)
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
        entity.setAddress(addressMapper.mapToEntity(dto.getAddressDto()));
        return entity;
    }

    public DoctorEntity mapToAddEntity(DoctorDto dto) {
        DoctorEntity entity = mapToEntity(dto);
        entity.setId(null);
        entity.getAddress().setId(null);
        return entity;
    }

    public DoctorDto mapToDto(DoctorEntity entity)
    {
        if(entity == null) return null;
        return new DoctorDto(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getTelephoneNumber(),
                entity.getDoctorNumber(),
                entity.getSpecialization(),
                addressMapper.mapToDto(entity.getAddress())
        );
    }

}
