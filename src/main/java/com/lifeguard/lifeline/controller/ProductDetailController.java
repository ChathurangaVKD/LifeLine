package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.ProductDetail;
import com.lifeguard.lifeline.service.ProductDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductDetailController {

    private ProductDetailService productDetailService;

    public ProductDetailController(ProductDetailService productDetailService) {
        this.productDetailService = productDetailService;
    }

    @PostMapping(path = "/Product/create-product-detail")
    public ProductDetail create(@RequestBody ProductDetail productDetail) {
        return productDetailService.create(productDetail);
    }

    @GetMapping(path = "/product/get-product-detail/{productId}")
    public ProductDetail get(@PathVariable("productId") Long productId) {
        return productDetailService.get(productId);
    }

    @GetMapping(path = "/product/get-all-product-detail")
    public List<ProductDetail> getAll() {
        return productDetailService.getAll();
    }

    @DeleteMapping(path = "/product/delete-product-detail/{productDetailId}")
    public void delete(@PathVariable("productDetailId") Long productDetailId) {
        productDetailService.delete(productDetailId);
    }
}
