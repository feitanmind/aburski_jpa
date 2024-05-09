package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.AddressDto;

import java.util.List;

public interface IAddressService
{
    AddressDto findById(final Long id);
    AddressDto get(Long id);
    AddressDto create(AddressDto dto);
    AddressDto update(AddressDto dto);
    void delete(Long id);
    List<AddressDto> getList();
}
