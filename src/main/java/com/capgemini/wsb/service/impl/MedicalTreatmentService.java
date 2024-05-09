package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.MedicalTreatmentDto;
import com.capgemini.wsb.mapper.MedicalTreatmentMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IMedicalTreatmentDao;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.service.interfaces.IMedicalTreatementService;

public class MedicalTreatmentService extends CrudService<MedicalTreatmentDto,Long, MedicalTreatmentEntity, MedicalTreatmentMapper, IMedicalTreatmentDao> implements IMedicalTreatementService {
    protected MedicalTreatmentService(IMedicalTreatmentDao dao) {
        super(dao, new MedicalTreatmentMapper());
    }
}
