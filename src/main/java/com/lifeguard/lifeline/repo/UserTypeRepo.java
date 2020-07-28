package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepo extends JpaRepository<UserType, Long> {
}
