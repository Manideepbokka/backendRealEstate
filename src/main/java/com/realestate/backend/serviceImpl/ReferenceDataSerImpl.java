package com.realestate.backend.serviceImpl;

import com.realestate.backend.model.ProjectsData;
import com.realestate.backend.model.enums.ProjectStatus;
import com.realestate.backend.repository.ProjectsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReferenceDataSerImpl {

    @Autowired
    ProjectsDataRepository projectsDataRepository;

    public List<ProjectsData> getAllOngoingProjectsData(){
        List<ProjectsData> allProjectsInDb= projectsDataRepository.findAll();
        return allProjectsInDb.stream().filter(
                        x->x.getProjectStatus().equals(ProjectStatus.ONGOING)
                ).toList();
    }

    public List<ProjectsData> getAllCompletedProjectsData(){
        List<ProjectsData> allProjectsInDb= projectsDataRepository.findAll();
        return allProjectsInDb.stream().filter(
                x->x.getProjectStatus().equals(ProjectStatus.COMPLETED)
        ).toList();
    }
}
