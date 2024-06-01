package com.realestate.backend.controllers;

import com.realestate.backend.model.ProjectsData;
import com.realestate.backend.serviceImpl.ReferenceDataSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/reference/v1")
public class ReferenceDataController {

    @Autowired
    ReferenceDataSerImpl referenceDataSer;
    @GetMapping("/projectsData")
    public ResponseEntity<List<ProjectsData>> getAllProjects(){
        List<ProjectsData> projectsCompleted = referenceDataSer.getAllCompletedProjectsData();
        List<ProjectsData> ongoingProj = referenceDataSer.getAllOngoingProjectsData();
        if(!projectsCompleted.isEmpty()){
            projectsCompleted.addAll(ongoingProj);
        }else{
            ongoingProj.addAll(projectsCompleted);
        }
        List<ProjectsData> allProjects = projectsCompleted.size() > ongoingProj.size() ? projectsCompleted : ongoingProj;
        return new ResponseEntity<>(allProjects, HttpStatus.OK);
    }

}
