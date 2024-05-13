package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.VisitDto;

import java.util.List;

public interface IVisitService {
    VisitDto get(Long id);
    VisitDto create(VisitDto dto);
    VisitDto update(VisitDto dto);
    void delete(Long id);
    List<VisitDto> getList();
    List<VisitDto> getListForPatient(Long id);
    List<VisitDto> getListForDoctor(Long id);
}
