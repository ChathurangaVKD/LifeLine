package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.ProductMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductMasterRepo extends JpaRepository<ProductMaster, Long> {
}
