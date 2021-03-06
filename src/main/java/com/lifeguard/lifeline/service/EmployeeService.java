package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.Employee;

import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployee(Long employeeId);

    List<Employee> getEmployeeByEmail(String email);

    List<Employee> getEmployeeByUserName(String userName);

    void deleteEmployee(Long employeeId);

    List<Employee> getAllEmployee();
}
