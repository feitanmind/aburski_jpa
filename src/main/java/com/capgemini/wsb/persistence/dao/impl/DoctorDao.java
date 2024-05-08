package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.interfaces.IDoctorDao;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDao extends AbstractDao<DoctorEntity,Long> implements IDoctorDao {
}
