package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier createSupplier(Supplier supplier);
    Supplier getSupplier(Long supplierId);
    void deleteSupplier(Long supplierId);
    List<Supplier> getAllSupplier();
}
