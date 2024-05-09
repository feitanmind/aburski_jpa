package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.enums.TreatmentType;

public class MedicalTreatmentDto {
    public MedicalTreatmentDto() {}
    public MedicalTreatmentDto(Long id, String description, TreatmentType treatmentType) {
        this.id = id;
        this.description = description;
        this.type = treatmentType;
    }
    private Long id;
    private String description;
    private TreatmentType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TreatmentType getType() {
        return type;
    }

    public void setType(TreatmentType type) {
        this.type = type;
    }
}
