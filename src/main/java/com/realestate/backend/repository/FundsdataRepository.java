package com.realestate.backend.repository;

import com.realestate.backend.model.FundsData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundsdataRepository extends JpaRepository<FundsData,Long> {
}
