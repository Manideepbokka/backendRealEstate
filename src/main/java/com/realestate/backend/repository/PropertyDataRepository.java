package com.realestate.backend.repository;

import com.realestate.backend.model.PropertyData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDataRepository extends JpaRepository<PropertyData,Long> {
}
