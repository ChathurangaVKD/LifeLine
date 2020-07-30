package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepo extends JpaRepository<Email, Long> {
}
