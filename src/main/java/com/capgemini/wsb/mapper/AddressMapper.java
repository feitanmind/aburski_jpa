package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.AddressDto;
import com.capgemini.wsb.persistence.entity.AddressEntity;

public final class AddressMapper implements IMapper<AddressDto,AddressEntity>
{

    public AddressDto mapToDto(AddressEntity entity) {
        if (entity == null)
        {
            return null;
        }
        final AddressDto addressTO = new AddressDto();
        addressTO.setId(entity.getId());
        addressTO.setAddressLine1(entity.getAddressLine1());
        addressTO.setAddressLine2(entity.getAddressLine2());
        addressTO.setCity(entity.getCity());
        addressTO.setPostalCode(entity.getPostalCode());
        return addressTO;
    }

    public AddressEntity mapToEntity(AddressDto dto) {
        if(dto == null)
        {
            return null;
        }
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setId(dto.getId());
        addressEntity.setAddressLine1(dto.getAddressLine1());
        addressEntity.setAddressLine2(dto.getAddressLine2());
        addressEntity.setCity(dto.getCity());
        addressEntity.setPostalCode(dto.getPostalCode());
        return addressEntity;
    }

    public AddressEntity mapToAddEntity(AddressDto dto) {
        AddressEntity entity = mapToEntity(dto);
        entity.setId(null);
        return entity;
    }
}
