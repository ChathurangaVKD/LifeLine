package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.*;
import com.lifeguard.lifeline.repo.EmployeeRepo;
import com.lifeguard.lifeline.service.EmployeeService;
import com.lifeguard.lifeline.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;
    private UserTypeService userTypeService;

//    @Autowired
//    private PasswordEncoder bcryptEncoder;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo, UserTypeService userTypeService) {
        this.employeeRepo = employeeRepo;
        this.userTypeService = userTypeService;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        this.persist(employee);
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        return employeeRepo.findById(employeeId).orElseThrow(() -> new EntityNotFoundException(employeeId + " Employee Not Found"));
    }

    @Override
    public List<Employee> getEmployeeByEmail(String email) {
        return employeeRepo.getEmployeeByEmail(email);
    }

    @Override
    public List<Employee> getEmployeeByUserName(String userName) {
        return employeeRepo.getEmployeesByUserName(userName);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepo.deleteById(employeeId);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    private Employee persist(Employee employee) {

        if (employee.getUserType() != null && employee.getUserType().getId() != null) {
            UserType userType = userTypeService.getUserTypeById(employee.getUserType().getId());
            employee.setUserType(userType);
        }

        if (employee.getPassword() != null) {
//            UserType userType = userTypeService.getUserTypeById(employee.getUserType().getId());
//            employee.setPassword(bcryptEncoder.encode(employee.getPassword()));
        }

        return employee;
    }

}
