package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.SaleMaster;
import com.lifeguard.lifeline.repo.SaleMasterRepo;
import com.lifeguard.lifeline.service.SaleMasterService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SaleMasterServiceImpl implements SaleMasterService {

    private SaleMasterRepo saleMasterRepo;

    public SaleMasterServiceImpl(SaleMasterRepo saleMasterRepo) {
        this.saleMasterRepo = saleMasterRepo;
    }

    @Override
    public SaleMaster create(SaleMaster saleDetail) {
        return saleMasterRepo.save(saleDetail);
    }

    @Override
    public SaleMaster get(Long saleId) {
        return saleMasterRepo.findById(saleId).orElseThrow(() -> new EntityNotFoundException(saleId + " Sale Not Found"));
    }

    @Override
    public List<SaleMaster> getAll() {
        return saleMasterRepo.findAll();
    }

    @Override
    public void delete(Long saleId) {
        saleMasterRepo.deleteById(saleId);
    }
}
