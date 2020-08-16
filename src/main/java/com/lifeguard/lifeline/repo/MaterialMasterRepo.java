package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.MaterialMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface MaterialMasterRepo extends JpaRepository<MaterialMaster, Long> {
}
