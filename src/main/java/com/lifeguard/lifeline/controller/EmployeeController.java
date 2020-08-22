package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.Employee;
import com.lifeguard.lifeline.service.EmployeeService;
import com.lifeguard.lifeline.service.JwtUserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;
    private JwtUserDetailsService userDetailsService;

    public EmployeeController(EmployeeService employeeService, JwtUserDetailsService userDetailsService) {
        this.employeeService = employeeService;
        this.userDetailsService = userDetailsService;
    }

    @PostMapping(path = "/user/create-employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return userDetailsService.createEmployees(employee);
    }

    @GetMapping(path = "/user/get-employee/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @GetMapping(path = "/user/get-all-employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @DeleteMapping(path = "/user/delete-employee")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

    @GetMapping(path = "/user/get-employee-by-email/{email}")
    public List<Employee> getEmployeeByEmail(@PathVariable("email") String email) {
        return employeeService.getEmployeeByEmail(email);
    }
}
