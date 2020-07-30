package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.MaterialDetail;
import com.lifeguard.lifeline.repo.MaterialDetailRepo;
import com.lifeguard.lifeline.service.MaterialDetailService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MaterialDetailServiceImpl implements MaterialDetailService {

    private MaterialDetailRepo materialDetailRepo;

    public MaterialDetailServiceImpl(MaterialDetailRepo materialDetailRepo) {
        this.materialDetailRepo = materialDetailRepo;
    }

    @Override
    public MaterialDetail create(MaterialDetail materialDetail) {
        return materialDetailRepo.save(materialDetail);
    }

    @Override
    public MaterialDetail get(Long materialId) {
        return materialDetailRepo.findById(materialId).orElseThrow(() -> new EntityNotFoundException(materialId + " MaterialDetail Not Found"));
    }

    @Override
    public List<MaterialDetail> getAll() {
        return materialDetailRepo.findAll();
    }

    @Override
    public void delete(Long materialDetailId) {
        materialDetailRepo.deleteById(materialDetailId);
    }
}
