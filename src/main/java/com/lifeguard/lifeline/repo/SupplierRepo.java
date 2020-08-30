package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepo extends JpaRepository<Supplier, Long> {
    @Override
    List<Supplier> findAllById(Iterable<Long> iterable);
}
