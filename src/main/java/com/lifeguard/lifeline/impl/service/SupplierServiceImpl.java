package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.Supplier;
import com.lifeguard.lifeline.entity.UserType;
import com.lifeguard.lifeline.repo.SupplierRepo;
import com.lifeguard.lifeline.service.SupplierService;
import com.lifeguard.lifeline.service.UserTypeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private SupplierRepo supplierRepo;
    private UserTypeService userTypeService;

    public SupplierServiceImpl(SupplierRepo supplierRepo, UserTypeService userTypeService) {
        this.supplierRepo = supplierRepo;
        this.userTypeService = userTypeService;
    }

    @Override
    public Supplier createSupplier(Supplier supplier) {
//        this.persist(supplier);
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

    private Supplier persist(Supplier supplier) {
//        if (supplier.getSupplierType() != null && supplier.getSupplierType().getId() != null) {
//            UserType userType = userTypeService.getUserTypeById(supplier.getSupplierType().getId());
//            supplier.setSupplierType(userType);
//        }

        return supplier;
    }
}
