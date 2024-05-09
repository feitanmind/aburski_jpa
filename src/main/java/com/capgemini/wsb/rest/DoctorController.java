package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.DoctorDto;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.interfaces.IDoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

@RestController
public class DoctorController {
    private final IDoctorService doctorService;

    public DoctorController(IDoctorService doctorService) {
        this.doctorService = doctorService;
    }
    @GetMapping("/doctor")
    List<DoctorDto> getDoctorsList()
    {
        final List<DoctorDto> doctorDtoList = doctorService.getList();
        return Objects.requireNonNullElseGet(doctorDtoList, ArrayList::new);
    }
    @GetMapping("/doctor/{id}")
    DoctorDto getDoctor(@PathVariable Long id)
    {
        DoctorDto dto = doctorService.get(id);
        if(dto != null)
        {
            return dto;
        }
        throw new EntityNotFoundException(id);
    }
    @PostMapping("/doctor")
    DoctorDto addDoctor(@RequestBody DoctorDto dto)
    {
        doctorService.create(dto);
        return dto;
    }
    @PutMapping("/doctor")
    DoctorDto updateDoctor(@RequestBody DoctorDto dto)
    {
        doctorService.update(dto);
        return dto;
    }
    @DeleteMapping("/doctor/{id}")
    void delete(@PathVariable Long id )
    {
        doctorService.delete(id);
    }
}
