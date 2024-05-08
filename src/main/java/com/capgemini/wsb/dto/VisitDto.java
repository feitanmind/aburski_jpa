package com.capgemini.wsb.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class VisitDto {
    public VisitDto() {}
    public VisitDto(int id, String description, LocalDateTime time, SimpleDoctorDto simpleDoctorDto, SimplePatientDto simplePatientDto, List<MedicalTreatmentDto> medicalTreatments)
    {
        this.id = id;
        this.description = description;
        this.time = time;
        this.patient = simplePatientDto;
        this.doctor = simpleDoctorDto;
        this.medicalTreatments = medicalTreatments;
    }

    private int id;
    private String description;
    private LocalDateTime time;
    private SimplePatientDto patient;
    private SimpleDoctorDto doctor;
    private List<MedicalTreatmentDto> medicalTreatments;

    public List<MedicalTreatmentDto> getMedicalTreatments() {
        return medicalTreatments;
    }

    public void setMedicalTreatments(List<MedicalTreatmentDto> medicalTreatments) {
        this.medicalTreatments = medicalTreatments;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SimplePatientDto getPatient() {
        return patient;
    }

    public void setPatient(SimplePatientDto patient) {
        this.patient = patient;
    }

    public SimpleDoctorDto getDoctor() {
        return doctor;
    }

    public void setDoctor(SimpleDoctorDto doctor) {
        this.doctor = doctor;
    }
}
