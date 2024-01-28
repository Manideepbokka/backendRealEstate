package com.realestate.backend.serviceImpl;

import com.realestate.backend.model.ProjectsData;
import com.realestate.backend.repository.ProjectsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ReferenceDataSerImpl {
    public static String ON_GOING="ONGOING";
    public static String COMP="COMPLETED";
    @Autowired
    ProjectsDataRepository projectsDataRepository;

    public List<ProjectsData> getAllOngoingProjectsData(){
        List<ProjectsData> allProjectsInDb= projectsDataRepository.findAll();
        return allProjectsInDb.stream().filter(
                        x->x.getProjectStatus().equalsIgnoreCase(ON_GOING)
                ).toList();
    }

    public List<ProjectsData> getAllCompletedProjectsData(){
        List<ProjectsData> allProjectsInDb= projectsDataRepository.findAll();
        return allProjectsInDb.stream().filter(
                x->x.getProjectStatus().equalsIgnoreCase(COMP)
        ).toList();
    }
}
