package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("select u from EMPLOYEE u where u.email = ?1")
    List<Employee> getEmployeeByEmail(String email);
}
