package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.interfaces.IVisitDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

@Repository
public class VisitDao extends AbstractDao<VisitEntity,Long> implements IVisitDao {
}
