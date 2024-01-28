package com.realestate.backend.repository;

import com.realestate.backend.model.CaseTable1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseTableRepository extends JpaRepository<CaseTable1,Long> {
}
