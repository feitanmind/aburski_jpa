package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.enums.Sex;

import java.time.LocalDate;
import java.util.List;

public class PatientDto {
    private int id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String patientNumber;
    private LocalDate birthDate;
    private LocalDate registrationDate;
    private Sex sex;
    private Long peselNumber;
    private AddressDto addressDto;
    private List<VisitDto> visits;

    public PatientDto() {}
    public PatientDto(int id, String firstName, String lastName, String telephoneNumber, String email,String patientNumber,LocalDate birthDate, LocalDate registrationDate,Sex sex,Long peselNumber,AddressDto addressDto,List<VisitDto> visits) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.patientNumber = patientNumber;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.sex = sex;
        this.peselNumber = peselNumber;
        this.addressDto = addressDto;
        this.visits = visits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Long getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(Long peselNumber) {
        this.peselNumber = peselNumber;
    }

    public List<VisitDto> getVisits() {
        return visits;
    }

    public void setVisits(List<VisitDto> visits) {
        this.visits = visits;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }
}
