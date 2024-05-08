package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.AddressDto;

public interface IAddressService
{
    AddressDto findById(final Long id);
    AddressDto get(Long id);
    AddressDto create(AddressDto dto);
    AddressDto update(AddressDto dto);
    void delete(Long id);
}
