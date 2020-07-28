package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
