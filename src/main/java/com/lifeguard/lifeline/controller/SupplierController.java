package com.lifeguard.lifeline.controller;

import com.lifeguard.lifeline.entity.Supplier;
import com.lifeguard.lifeline.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {
    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping(path = "/user/create-supplier")
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierService.createSupplier(supplier);
    }

    @GetMapping(path = "/user/get-supplier/{supplierId}")
    public Supplier getSupplier(@PathVariable("supplierId") Long supplierId) {
        return supplierService.getSupplier(supplierId);
    }

    @GetMapping(path = "/user/get-all-supplier")
    public List<Supplier> getAllSupplier() {
        return supplierService.getAllSupplier();
    }

    @DeleteMapping(path = "/user/delete-supplier/{supplierId}")
    public void deleteSupplier(@PathVariable("supplierId") Long supplierId) {
        supplierService.deleteSupplier(supplierId);
    }
}
