package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier, Long> {
}
