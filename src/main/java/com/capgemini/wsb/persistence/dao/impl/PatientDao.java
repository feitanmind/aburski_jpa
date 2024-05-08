package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.interfaces.IPatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDao extends AbstractDao<PatientEntity,Long> implements IPatientDao {
}
