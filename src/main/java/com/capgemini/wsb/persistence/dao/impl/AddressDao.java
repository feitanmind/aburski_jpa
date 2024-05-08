package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.interfaces.IAddressDao;
import com.capgemini.wsb.persistence.entity.AddressEntity;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDao extends AbstractDao<AddressEntity, Long> implements IAddressDao
{

}
