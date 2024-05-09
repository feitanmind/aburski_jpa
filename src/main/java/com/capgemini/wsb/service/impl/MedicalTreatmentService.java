package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.MedicalTreatmentDto;
import com.capgemini.wsb.mapper.MedicalTreatmentMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IMedicalTreatmentDao;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.service.interfaces.IMedicalTreatementService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MedicalTreatmentService extends CrudService<MedicalTreatmentDto,Long, MedicalTreatmentEntity, MedicalTreatmentMapper, IMedicalTreatmentDao> implements IMedicalTreatementService {
    public MedicalTreatmentService(IMedicalTreatmentDao dao) {
        super(dao, new MedicalTreatmentMapper());
    }
}
