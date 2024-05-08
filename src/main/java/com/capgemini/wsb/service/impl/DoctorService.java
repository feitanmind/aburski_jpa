package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.DoctorDto;
import com.capgemini.wsb.mapper.DoctorMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IDoctorDao;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.service.interfaces.IDoctorService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DoctorService extends CrudService<DoctorDto,Long, DoctorEntity, DoctorMapper, IDoctorDao> implements IDoctorService {

    protected DoctorService(IDoctorDao dao) {
        super(dao, new DoctorMapper());
    }
}
