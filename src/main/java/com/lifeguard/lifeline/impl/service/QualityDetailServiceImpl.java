package com.lifeguard.lifeline.impl.service;

import com.lifeguard.lifeline.entity.QualityDetails;
import com.lifeguard.lifeline.repo.QualityDetailRepo;
import com.lifeguard.lifeline.service.QualityService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class QualityDetailServiceImpl implements QualityService {

    private QualityDetailRepo qualityDetailRepo;

    public QualityDetailServiceImpl(QualityDetailRepo qualityDetailRepo) {
        this.qualityDetailRepo = qualityDetailRepo;
    }

    @Override
    public QualityDetails create(QualityDetails quality) {
        return qualityDetailRepo.save(quality);
    }

    @Override
    public QualityDetails get(Long qualityId) {
        return qualityDetailRepo.findById(qualityId).orElseThrow(() -> new EntityNotFoundException(qualityId + " Quality Not Found"));
    }

    @Override
    public List<QualityDetails> getAll() {
        return qualityDetailRepo.findAll();
    }

    @Override
    public void delete(Long qualityId) {
        qualityDetailRepo.deleteById(qualityId);
    }
}
