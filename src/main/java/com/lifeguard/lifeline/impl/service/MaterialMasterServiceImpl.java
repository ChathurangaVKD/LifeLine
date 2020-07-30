package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.MaterialMaster;
import com.lifeguard.lifeline.entity.MaterialType;
import com.lifeguard.lifeline.repo.MaterialMasterRepo;
import com.lifeguard.lifeline.service.MaterialMasterService;
import com.lifeguard.lifeline.service.MaterialTypeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MaterialMasterServiceImpl implements MaterialMasterService {

    private MaterialMasterRepo materialMasterRepo;
    private MaterialTypeService materialTypeService;

    public MaterialMasterServiceImpl(MaterialMasterRepo materialMasterRepo, MaterialTypeService materialTypeService) {
        this.materialMasterRepo = materialMasterRepo;
        this.materialTypeService = materialTypeService;
    }

    @Override
    public MaterialMaster create(MaterialMaster material) {
        this.persist(material);
        return materialMasterRepo.save(material);
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

    private MaterialMaster persist(MaterialMaster materialMaster){

        if (materialMaster.getMaterialType() != null && materialMaster.getMaterialType().getId() != null){
            MaterialType materialType = materialTypeService.get(materialMaster.getMaterialType().getId());
            materialMaster.setMaterialType(materialType);
        }

        return materialMaster;
    }
}
