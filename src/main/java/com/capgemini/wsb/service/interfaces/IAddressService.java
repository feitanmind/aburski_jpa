package com.capgemini.wsb.service.interfaces;

import com.capgemini.wsb.dto.AddressDto;

public interface IAddressService
{
    public AddressDto findById(final Long id);
}
