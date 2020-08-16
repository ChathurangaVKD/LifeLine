package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.SaleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface SaleMasterRepo extends JpaRepository<SaleMaster, Long> {
}
