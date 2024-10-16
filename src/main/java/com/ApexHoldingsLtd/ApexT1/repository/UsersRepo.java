package com.ApexHoldingsLtd.ApexT1.repository;

import com.ApexHoldingsLtd.ApexT1.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers, Integer> {

    Optional<OurUsers> findByEmail(String email);
}
