package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.MaterialMaster;
import com.lifeguard.lifeline.entity.Supplier;
import com.lifeguard.lifeline.repo.MaterialMasterRepo;
import com.lifeguard.lifeline.service.MaterialMasterService;
import com.lifeguard.lifeline.service.MaterialTypeService;
import com.lifeguard.lifeline.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MaterialMasterServiceImpl implements MaterialMasterService {

    private MaterialMasterRepo materialMasterRepo;
    private MaterialTypeService materialTypeService;
    private SupplierService supplierService;

    public MaterialMasterServiceImpl(MaterialMasterRepo materialMasterRepo, MaterialTypeService materialTypeService, SupplierService supplierService) {
        this.materialMasterRepo = materialMasterRepo;
        this.materialTypeService = materialTypeService;
        this.supplierService = supplierService;
    }

    @Override
    public MaterialMaster create(MaterialMaster material) {
        return materialMasterRepo.save(this.persist(material));
    }

    @Override
    public MaterialMaster get(Long materialId) {
        return materialMasterRepo.findById(materialId).orElseThrow(() -> new EntityNotFoundException(materialId + " Material Not Found"));
    }

    @Override
    public List<MaterialMaster> getAll() {
        return materialMasterRepo.findAll();
    }

    @Override
    public void delete(Long materialId) {
        materialMasterRepo.deleteById(materialId);
    }

    private MaterialMaster persist(MaterialMaster materialMaster) {

        materialMaster.setSuppliers(supplierService.getAllSuppliers(materialMaster.getSuppliers()));

        return materialMaster;
    }
}
