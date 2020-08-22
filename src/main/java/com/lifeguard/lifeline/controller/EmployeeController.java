package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.Employee;
import com.lifeguard.lifeline.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(path = "/user/create-employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
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
