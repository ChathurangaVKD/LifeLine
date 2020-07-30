package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepo extends JpaRepository<ProductDetail, Long> {
}
