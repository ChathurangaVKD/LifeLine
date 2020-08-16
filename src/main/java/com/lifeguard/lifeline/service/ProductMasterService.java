package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.ProductMaster;

import java.util.List;

public interface ProductMasterService {
    ProductMaster create(ProductMaster product);

    ProductMaster get(Long productId);

    List<ProductMaster> getAll();

    void delete(Long productId);
}
