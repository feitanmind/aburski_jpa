package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.DoctorDto;

public interface IDoctorService {
    DoctorDto get(Long id);
    DoctorDto create(DoctorDto dto);
    DoctorDto update(DoctorDto dto);
    void delete(Long id);
}
