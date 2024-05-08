package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.AddressDto;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.interfaces.IAddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController
{

    private final IAddressService addressService;


    public AddressController(IAddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/address/{id}")
    AddressDto findBaId(@PathVariable final Long id) {
        final AddressDto address = addressService.findById(id);
        if(address != null)
        {
            return address;
        }
        throw new EntityNotFoundException(id);
    }
}
