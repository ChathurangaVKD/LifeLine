package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.Employee;
import com.lifeguard.lifeline.repo.EmployeeRepo;
import com.lifeguard.lifeline.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        return employeeRepo.findById(employeeId).orElseThrow(() -> new EntityNotFoundException(employeeId + " Employee Not Found"));
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepo.deleteById(employeeId);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }
}
