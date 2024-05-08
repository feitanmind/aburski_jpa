package com.capgemini.wsb.dto;

import java.time.LocalDate;

public class SimplePatientDto {
    public SimplePatientDto(){}
    public SimplePatientDto(int id, String name, LocalDate dateOfBirth, String patientNumber)
    {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.patientNumber = patientNumber;
    }

    private int id;
    private  String name;
    private LocalDate dateOfBirth;
    private String patientNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }
}
