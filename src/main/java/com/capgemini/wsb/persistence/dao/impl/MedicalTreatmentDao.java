package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.interfaces.IMedicalTreatmentDao;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class MedicalTreatmentDao extends AbstractDao<MedicalTreatmentEntity, Long> implements IMedicalTreatmentDao {
}
