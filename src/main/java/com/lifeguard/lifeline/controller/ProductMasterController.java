package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.ProductMaster;
import com.lifeguard.lifeline.service.ProductMasterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductMasterController {

    private ProductMasterService productMasterService;

    public ProductMasterController(ProductMasterService productMasterService) {
        this.productMasterService = productMasterService;
    }

    @PostMapping(path = "/product/create")
    public ProductMaster create(@RequestBody ProductMaster product){
        return productMasterService.create(product);
    }

    @GetMapping(path = "/product/get/{productId}")
    public ProductMaster get(@PathVariable("productId") Long productId){
        return productMasterService.get(productId);
    }

    @GetMapping(path = "/product/get-all")
    public List<ProductMaster> getAll(){
        return productMasterService.getAll();
    }

    @DeleteMapping(path = "/product/delete/{productId}")
    public void delete(@PathVariable("productId") Long productId){
        productMasterService.delete(productId);
    }
}
