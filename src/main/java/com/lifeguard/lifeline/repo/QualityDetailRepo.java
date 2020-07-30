package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.QualityDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualityDetailRepo extends JpaRepository<QualityDetails, Long> {
}
