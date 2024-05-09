package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.MedicalTreatmentDto;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.interfaces.IMedicalTreatementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class MedicalTreatmentController {
    private final IMedicalTreatementService medicalTreatmentService;

    public MedicalTreatmentController(IMedicalTreatementService medicalTreatementService) {
        this.medicalTreatmentService = medicalTreatementService;
    }
    @GetMapping("/medicalTreatment") //Postman Testing OK
    List<MedicalTreatmentDto> getMedicalTreatmentsList()
    {
        final List<MedicalTreatmentDto> medicalTreatmentDtoList = medicalTreatmentService.getList();
        return Objects.requireNonNullElseGet(medicalTreatmentDtoList, ArrayList::new);
    }
    @GetMapping("/medicalTreatment/{id}")
    MedicalTreatmentDto getMedicalTreatment(@PathVariable Long id) //Postman testing OK
    {
        MedicalTreatmentDto dto = medicalTreatmentService.get(id);
        if(dto != null)
        {
            return dto;
        }
        throw new EntityNotFoundException(id);
    }
    @PostMapping("/medicalTreatment") //Postman Testing OK
    MedicalTreatmentDto addMedicalTreatment(@RequestBody MedicalTreatmentDto dto)
    {
        medicalTreatmentService.create(dto);
        return dto;
    }
    @PutMapping("/medicalTreatment") //Postman Testing OK
    MedicalTreatmentDto updateMedicalTreatment(@RequestBody MedicalTreatmentDto dto)
    {
        medicalTreatmentService.update(dto);
        return dto;
    }
    @DeleteMapping("/medicalTreatment/{id}") //Postman Testing OK
    void delete(@PathVariable Long id )
    {
        medicalTreatmentService.delete(id);
    }
}
