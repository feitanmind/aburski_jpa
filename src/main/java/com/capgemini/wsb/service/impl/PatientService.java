package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientDto;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IPatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.service.interfaces.IPatientService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class PatientService extends CrudService<PatientDto,Long, PatientEntity, PatientMapper, IPatientDao> implements IPatientService {

    public PatientService(IPatientDao dao) {
        super(dao, new PatientMapper());
    }
}
