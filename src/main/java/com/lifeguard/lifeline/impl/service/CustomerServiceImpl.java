package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.Customer;
import com.lifeguard.lifeline.repo.CustomerRepo;
import com.lifeguard.lifeline.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer getCustomer(Long customerId) {
        return customerRepo.findById(customerId).orElseThrow(() -> new EntityNotFoundException(customerId + " Cutomer Not Found"));
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerRepo.deleteById(customerId);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }
}
