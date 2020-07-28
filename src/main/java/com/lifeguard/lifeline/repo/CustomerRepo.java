package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
