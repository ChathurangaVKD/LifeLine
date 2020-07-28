package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.Customer;
import com.lifeguard.lifeline.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping(path = "/user/create-customer")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping(path = "/user/get-customer/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Long customerId){
        return customerService.getCustomer(customerId);
    }

    @GetMapping(path = "/user/get-all-customer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @DeleteMapping(path = "/user/delete-customer")
    public void deleteCustomer(@PathVariable("customerId") Long customerId){
        customerService.deleteCustomer(customerId);
    }
}
