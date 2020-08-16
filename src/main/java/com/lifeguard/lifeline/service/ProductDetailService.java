package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.ProductDetail;

import java.util.List;

public interface ProductDetailService {

    ProductDetail create(ProductDetail productDetail);

    ProductDetail get(Long productId);

    List<ProductDetail> getAll();

    void delete(Long productDetailId);
}
