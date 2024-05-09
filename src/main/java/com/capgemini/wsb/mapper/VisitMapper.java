package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.MedicalTreatmentDto;
import com.capgemini.wsb.dto.SimpleDoctorDto;
import com.capgemini.wsb.dto.SimplePatientDto;
import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.ArrayList;
import java.util.List;

public class VisitMapper implements IMapper<VisitDto, VisitEntity> {
    private final MedicalTreatmentMapper medicalTreatmentMapper = new MedicalTreatmentMapper();

    public VisitDto mapToDto(VisitEntity entity) {
        List<MedicalTreatmentDto> medicalTreatmentDtos = new ArrayList<>();
        for(MedicalTreatmentEntity me : entity.getMedialTreatments())
        {
            medicalTreatmentDtos.add(medicalTreatmentMapper.mapToDto(me));
        }

        return new VisitDto(
                entity.getId(),
                entity.getDescription(),
                entity.getTime(),
                new SimpleDoctorDto(entity.getDoctor().getId(),entity.getDoctor().getFirstName() + " "+ entity.getDoctor().getLastName(),entity.getDoctor().getSpecialization()),
                new SimplePatientDto(entity.getPatient().getId(),entity.getPatient().getFirstName() + " "+entity.getPatient().getLastName(),entity.getPatient().getDateOfBirth(),entity.getPatient().getPatientNumber()),
                medicalTreatmentDtos
        );
    }

    public VisitEntity mapToEntity(VisitDto dto) {
        if(dto == null) return null;
        VisitEntity visitEntity = new VisitEntity();
        PatientEntity patientEntity = new PatientEntity();
        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setId(dto.getDoctor().getId());
        patientEntity.setId(dto.getPatient().getId());

        visitEntity.setId(dto.getId());
        visitEntity.setDescription(dto.getDescription());
        visitEntity.setTime(dto.getTime());
        visitEntity.setPatient(patientEntity);
        visitEntity.setDoctor(doctorEntity);
        visitEntity.setDescription(dto.getDescription());
        visitEntity.setTime(dto.getTime());
        List<MedicalTreatmentEntity> medicalTreatmentEntities = new ArrayList<>();
        for(MedicalTreatmentDto mtd : dto.getMedicalTreatments())
        {
            medicalTreatmentEntities.add(medicalTreatmentMapper.mapToEntity(mtd));
        }
        visitEntity.setMedialTreatments(medicalTreatmentEntities);
        return visitEntity;
    }

    public VisitEntity mapToAddEntity(VisitDto dto) {
        VisitEntity visitEntity = mapToEntity(dto);
        visitEntity.setId(null);
        for(MedicalTreatmentEntity mt : visitEntity.getMedialTreatments())
        {
            mt.setId(null);
        }
        return visitEntity;
    }
}
