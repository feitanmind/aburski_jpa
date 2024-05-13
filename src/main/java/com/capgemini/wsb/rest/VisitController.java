package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.VisitDto;
import com.capgemini.wsb.service.interfaces.IVisitService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

@RestController
public class VisitController {
    private final IVisitService visitService;

    public VisitController(IVisitService visitService) {
        this.visitService = visitService;
    }
    @GetMapping("/visit") //Postman Testing OK
    List<VisitDto> getVisitsList()
    {
        final List<VisitDto> visitDtoList = visitService.getList();
        return Objects.requireNonNullElseGet(visitDtoList, ArrayList::new);
    }
    @GetMapping("/visit/{id}")
    VisitDto getVisit(@PathVariable Long id)
    {
        VisitDto dto = visitService.get(id);
        if(dto != null)
        {
            return dto;
        }
        throw new EntityNotFoundException();
    }
    @GetMapping("/visit/doctor/{id}")
    List<VisitDto> getVisitForDoctor(@PathVariable Long id)
    {
        return visitService.getListForDoctor(id);
    }
    @GetMapping("/visit/patient/{id}")
    List<VisitDto> getVisitForPatient(@PathVariable Long id)
    {
        return visitService.getListForPatient(id);
    }
    @PostMapping("/visit") //Postman Testing OK
    VisitDto addVisit(@RequestBody VisitDto dto)
    {
        visitService.create(dto);
        return dto;
    }
    @PutMapping("/visit") //Postman Testing OK
    VisitDto updateVisit(@RequestBody VisitDto dto)
    {
        visitService.update(dto);
        return dto;
    }
    @DeleteMapping("/visit/{id}") //Postman Testing OK
    void delete(@PathVariable Long id )
    {
        VisitDto dto = visitService.get(id);
        if(dto != null)
        {
            visitService.delete(id);
        }
        throw new EntityNotFoundException();
    }
}
