package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.enums.Specialization;

public class SimpleDoctorDto {
    public SimpleDoctorDto(){}
    public SimpleDoctorDto(Long id, String name, Specialization specialization)
    {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    private Long id;
    private String name;
    private Specialization specialization;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
}
