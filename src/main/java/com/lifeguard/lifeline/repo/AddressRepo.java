package com.lifeguard.lifeline.repo;

import com.lifeguard.lifeline.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
