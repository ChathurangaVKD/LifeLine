package com.lifeguard.lifeline.service;

import java.util.ArrayList;
import java.util.List;

import com.lifeguard.lifeline.entity.Employee;
import com.lifeguard.lifeline.entity.UserType;
import com.lifeguard.lifeline.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    private EmployeeService employeeService;
    @Autowired
    private PasswordEncoder bcryptEncoder;
    private UserTypeService userTypeService;
    private EmployeeRepo employeeRepo;

    public JwtUserDetailsService(EmployeeService employeeService, UserTypeService userTypeService, EmployeeRepo employeeRepo) {
        this.employeeService = employeeService;
        this.userTypeService = userTypeService;
        this.employeeRepo = employeeRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if ("gg".equals(username)) {
//            return new User("gg", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
//                    new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
        List<Employee> employee = employeeRepo.getEmployeeByEmail(username);
        Employee employee1 = employee.get(0);
        return new org.springframework.security.core.userdetails.User(employee1.getEmail(), employee1.getPassword(),
                new ArrayList<>());

    }

    public Employee createEmployees(Employee employee) {
        this.persist(employee);
        return employeeRepo.save(employee);
    }

    private Employee persist(Employee employee) {

        if (employee.getPassword() != null) {
            employee.setPassword(bcryptEncoder.encode(employee.getPassword()));
        }
        if (employee.getUserType() != null && employee.getUserType().getId() != null) {
            UserType userType = userTypeService.getUserTypeById(employee.getUserType().getId());
            employee.setUserType(userType);
        }
        return employee;
    }

}

