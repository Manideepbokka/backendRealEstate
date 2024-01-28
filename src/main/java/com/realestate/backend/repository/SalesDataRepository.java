package com.realestate.backend.repository;

import com.realestate.backend.model.SalesData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesDataRepository extends JpaRepository<SalesData,Long> {
}
