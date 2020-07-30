package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.ProductDetail;
import com.lifeguard.lifeline.repo.ProductDetailRepo;
import com.lifeguard.lifeline.service.ProductDetailService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    private ProductDetailRepo productDetailRepo;

    public ProductDetailServiceImpl(ProductDetailRepo productDetailRepo) {
        this.productDetailRepo = productDetailRepo;
    }

    @Override
    public ProductDetail create(ProductDetail productDetail) {
        return productDetailRepo.save(productDetail);
    }

    @Override
    public ProductDetail get(Long productId) {
        return productDetailRepo.findById(productId).orElseThrow(() -> new EntityNotFoundException(productId + " ProductDetail Not Found"));
    }

    @Override
    public List<ProductDetail> getAll() {
        return productDetailRepo.findAll();
    }

    @Override
    public void delete(Long productDetailId) {
        productDetailRepo.deleteById(productDetailId);
    }
}
