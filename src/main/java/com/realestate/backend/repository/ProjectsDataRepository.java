package com.realestate.backend.repository;

import com.realestate.backend.model.ProjectsData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsDataRepository extends JpaRepository<ProjectsData,Long> {
}