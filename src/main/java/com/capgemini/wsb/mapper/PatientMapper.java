package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientDto;
import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.ArrayList;
import java.util.List;

public class PatientMapper implements IMapper<PatientDto, PatientEntity> {
    private final AddressMapper addressMapper = new AddressMapper();
    private final VisitMapper visitMapper = new VisitMapper();

    public PatientDto mapToDto(PatientEntity entity) {
        if(entity == null) return null;
        List<VisitDto> visits = new ArrayList<>();
        for(VisitEntity ve : entity.getVisits())
        {
            visits.add(visitMapper.mapToDto(ve));
        }
        
        return new PatientDto(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getTelephoneNumber(),
                entity.getEmail(),
                entity.getPatientNumber(),
                entity.getDateOfBirth(),
                entity.getRegistrationDate(),
                entity.getSex(),
                entity.getPeselNumber(),
                addressMapper.mapToDto(entity.getAddress()),
                visits
        );
    }

    public PatientEntity mapToEntity(PatientDto dto) {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setFirstName(dto.getFirstName());
        patientEntity.setLastName(dto.getLastName());
        patientEntity.setDateOfBirth(dto.getBirthDate());
        patientEntity.setSex(dto.getSex());
        patientEntity.setEmail(dto.getEmail());
        patientEntity.setPatientNumber(dto.getPatientNumber());
        patientEntity.setAddress(addressMapper.mapToEntity(dto.getAddressDto()));
        patientEntity.setRegistrationDate(dto.getRegistrationDate());
        patientEntity.setTelephoneNumber(dto.getTelephoneNumber());
        patientEntity.setPeselNumber(dto.getPeselNumber());
        patientEntity.setId(dto.getId());
        List<VisitEntity> visitEntities = new ArrayList<>();
        for(VisitDto visitDto : dto.getVisits())
        {
            visitEntities.add(visitMapper.mapToEntity(visitDto));
        }
        patientEntity.setVisits(visitEntities);
        return patientEntity;
    }

    public PatientEntity mapToAddEntity(PatientDto dto) {
        PatientEntity patientEntity = mapToEntity(dto);
        patientEntity.setId(null);
        patientEntity.getAddress().setId(null);
        for(VisitEntity visitEntity : patientEntity.getVisits())
        {
            visitEntity.setId(null);
        }
        return patientEntity;
    }
}
