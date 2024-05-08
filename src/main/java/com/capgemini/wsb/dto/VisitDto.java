package com.capgemini.wsb.dto;

import java.time.LocalDateTime;
import java.util.List;

public class VisitDto {
    private int id;
    private String description;
    private LocalDateTime time;
    private int doctorId;
    private String doctorName;
    private int patientId;
    private String patientName;
    private List<MedicalTreatmentDto> medicalTreatments;

    public List<MedicalTreatmentDto> getMedicalTreatments() {
        return medicalTreatments;
    }

    public void setMedicalTreatments(List<MedicalTreatmentDto> medicalTreatments) {
        this.medicalTreatments = medicalTreatments;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
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
}
