package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.Customer;
import com.lifeguard.lifeline.entity.Email;
import com.lifeguard.lifeline.entity.UserType;
import com.lifeguard.lifeline.repo.CustomerRepo;
import com.lifeguard.lifeline.service.CustomerService;
import com.lifeguard.lifeline.service.EmailService;
import com.lifeguard.lifeline.service.UserTypeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo customerRepo;
    private UserTypeService userTypeService;
    private EmailService emailService;

    public CustomerServiceImpl(CustomerRepo customerRepo, UserTypeService userTypeService, EmailService emailService) {
        this.customerRepo = customerRepo;
        this.userTypeService = userTypeService;
        this.emailService = emailService;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        this.persist(customer);
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

    @Override
    public Customer addEmail(Long customerId, Email email) {
        Customer customer = this.getCustomer(customerId);
        List<Email> EmailList = customer.getEmail();
        Email email1 = emailService.create(email);
        EmailList.add(email1);
        customer.setEmail(EmailList);
        return customerRepo.save(customer);
    }

    @Override
    public void deleteEmail(Long customerId, Long emailId) {

    }

    private Customer persist(Customer customer) {
        if (customer.getCustomerType() != null && customer.getCustomerType().getId() != null) {
            UserType userType = userTypeService.getUserTypeById(customer.getCustomerType().getId());
            customer.setCustomerType(userType);
        }

        return customer;
    }
}
