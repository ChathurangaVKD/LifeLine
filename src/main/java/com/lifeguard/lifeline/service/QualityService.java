package com.lifeguard.lifeline.service;

import com.lifeguard.lifeline.entity.QualityDetails;

import java.util.List;

public interface QualityService {
    QualityDetails create(QualityDetails quality);
    QualityDetails get(Long qualityId);
    List<QualityDetails> getAll();
    void delete(Long qualityId);
}
