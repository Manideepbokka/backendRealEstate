package com.realestate.backend.repository;

import com.realestate.backend.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDataRepository extends JpaRepository<EmployeeData,Long> {
}