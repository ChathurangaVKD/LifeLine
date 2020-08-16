package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.Address;
import com.lifeguard.lifeline.repo.AddressRepo;
import com.lifeguard.lifeline.service.AddressService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public Address create(Address address) {
        return addressRepo.save(address);
    }

    @Override
    public Address get(Long addressId) {
        return addressRepo.findById(addressId).orElseThrow(() -> new EntityNotFoundException(addressId + " Supplier Not Found"));
    }

    @Override
    public void delete(Long addressId) {
        addressRepo.deleteById(addressId);
    }

    @Override
    public List<Address> getAll() {
        return addressRepo.findAll();
    }
}
