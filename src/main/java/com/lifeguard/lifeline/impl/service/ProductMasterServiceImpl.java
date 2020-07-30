package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.ProductMaster;
import com.lifeguard.lifeline.repo.ProductMasterRepo;
import com.lifeguard.lifeline.service.ProductMasterService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProductMasterServiceImpl implements ProductMasterService {

    private ProductMasterRepo productMasterRepo;

    public ProductMasterServiceImpl(ProductMasterRepo productMasterRepo) {
        this.productMasterRepo = productMasterRepo;
    }

    @Override
    public ProductMaster create(ProductMaster product) {
        return productMasterRepo.save(product);
    }

    @Override
    public ProductMaster get(Long productId) {
        return productMasterRepo.findById(productId).orElseThrow(() -> new EntityNotFoundException(productId + " Product Not Found"));
    }

    @Override
    public List<ProductMaster> getAll() {
        return productMasterRepo.findAll();
    }

    @Override
    public void delete(Long productId) {
        productMasterRepo.deleteById(productId);
    }
}
