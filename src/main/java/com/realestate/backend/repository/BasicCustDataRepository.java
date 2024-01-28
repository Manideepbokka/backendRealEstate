package com.realestate.backend.repository;

import com.realestate.backend.model.BasicCustData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicCustDataRepository extends JpaRepository<BasicCustData, Long> {
}