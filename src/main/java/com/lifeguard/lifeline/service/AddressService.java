package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.Address;

import java.util.List;

public interface AddressService {
    Address create(Address address);
    Address get(Long addressId);
    void delete(Long addressId);
    List<Address> getAll();

}
