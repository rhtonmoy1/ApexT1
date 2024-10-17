package com.ApexHoldingsLtd.ApexT1.repository;

import com.ApexHoldingsLtd.ApexT1.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers, Integer>, JpaSpecificationExecutor<OurUsers> {
    Optional<OurUsers> findByUserid(String userid);
}
