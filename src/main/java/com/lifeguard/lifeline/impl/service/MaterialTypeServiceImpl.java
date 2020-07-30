package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.MaterialType;
import com.lifeguard.lifeline.repo.MaterialTypeRepo;
import com.lifeguard.lifeline.service.MaterialTypeService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MaterialTypeServiceImpl implements MaterialTypeService {

    private MaterialTypeRepo materialTypeRepo;

    public MaterialTypeServiceImpl(MaterialTypeRepo materialTypeRepo) {
        this.materialTypeRepo = materialTypeRepo;
    }

    @Override
    public MaterialType create(MaterialType materialType) {
        return materialTypeRepo.save(materialType);
    }

    @Override
    public List<MaterialType> getAll() {
        return materialTypeRepo.findAll();
    }

    @Override
    public void delete(Long materialTypeId) {
        materialTypeRepo.deleteById(materialTypeId);
    }

    @Override
    public MaterialType get(Long materialTypeId) {
        return materialTypeRepo.findById(materialTypeId).orElseThrow(() -> new EntityNotFoundException(materialTypeId + " MaterialType Not Found"));
    }
}
