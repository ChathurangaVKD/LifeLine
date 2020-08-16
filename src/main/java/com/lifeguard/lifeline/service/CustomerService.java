package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.Customer;
import com.lifeguard.lifeline.entity.Email;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    Customer getCustomer(Long customerId);

    void deleteCustomer(Long customerId);

    List<Customer> getAllCustomer();

    Customer addEmail(Long customerId, Email email);

    void deleteEmail(Long customerId, Long emailId);
}
