package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.enums.TreatmentType;

public class MedicalTreatmentDto {
    public MedicalTreatmentDto() {}
    public MedicalTreatmentDto(int id, String description, TreatmentType treatmentType) {
        this.id = id;
        this.description = description;
        this.type = treatmentType;
    }
    private int id;
    private String description;
    private TreatmentType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
