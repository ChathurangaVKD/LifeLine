package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.Supplier;
import com.lifeguard.lifeline.repo.SupplierRepo;
import com.lifeguard.lifeline.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private SupplierRepo supplierRepo;

    public SupplierServiceImpl(SupplierRepo supplierRepo){
        this.supplierRepo = supplierRepo;
    }

    @Override
    public Supplier createSupplier(Supplier supplier) {
        return supplierRepo.save(supplier);
    }

    @Override
    public Supplier getSupplier(Long supplierId) {
        return supplierRepo.findById(supplierId).orElseThrow(() -> new EntityNotFoundException(supplierId + " Supplier Not Found"));
    }

    @Override
    public void deleteSupplier(Long supplierId) {
        supplierRepo.deleteById(supplierId);
    }

    @Override
    public List<Supplier> getAllSupplier() {
        return supplierRepo.findAll();
    }
}
