package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.AddressDto;
import com.capgemini.wsb.mapper.AddressMapper;
import com.capgemini.wsb.persistence.dao.interfaces.IAddressDao;
import com.capgemini.wsb.persistence.entity.AddressEntity;
import com.capgemini.wsb.service.interfaces.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AddressService implements IAddressService
{
    private final IAddressDao addressDao;

    @Autowired
    public AddressService(IAddressDao pAddressDao)
    {
        addressDao = pAddressDao;
    }

    @Override
    public AddressDto findById(Long id) {
        final AddressEntity entity = addressDao.findOne(id);
        return AddressMapper.mapToTO(entity);
    }
}
