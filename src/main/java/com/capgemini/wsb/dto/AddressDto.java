package com.capgemini.wsb.dto;

import java.io.Serializable;

public class AddressDto implements Serializable
{
    public AddressDto(){}
    public AddressDto(Long id, String addressLine1, String addressLine2, String postalCode)
    {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postalCode = postalCode;
    }
    private Long id;

    private String city;

    private String addressLine1;

    private String addressLine2;

    private String postalCode;

    public String toString(){
        return String.format("{id: %s, ad1: %s, ad2: %s, postalCode: %s}",id,addressLine1,addressLine2,postalCode);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
