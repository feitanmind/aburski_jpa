package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.PatientDto;
import com.capgemini.wsb.service.impl.PatientService;
import com.capgemini.wsb.service.interfaces.IPatientService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class PatientController {
    private final IPatientService patientService;

    public PatientController(IPatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patient")
    List<PatientDto> getPatientsList()
    {
        final List<PatientDto> patientDtoList = patientService.getList();
        return Objects.requireNonNullElseGet(patientDtoList, ArrayList::new);
    }
    @PostMapping("/patient")
    PatientDto addPatient(@RequestBody PatientDto dto)
    {
        patientService.create(dto);
        return dto;
    }
    @PutMapping("/patient")
    PatientDto updatePatient(@RequestBody PatientDto dto)
    {
        patientService.update(dto);
        return dto;
    }

}
