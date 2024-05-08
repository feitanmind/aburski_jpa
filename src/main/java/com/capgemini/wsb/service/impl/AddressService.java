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
public class AddressService extends CrudService<AddressDto,Long,AddressEntity, AddressMapper,IAddressDao> implements IAddressService
{

    public AddressService(IAddressDao addressDao)
    {
        super(addressDao,new AddressMapper());
    }

    public AddressDto findById(Long id) {
        final AddressEntity entity = dao.findOne(id);
        return mapper.mapToDto(entity);
    }

}
