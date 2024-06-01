package com.realestate.backend.model;

import com.realestate.backend.model.enums.ProjectStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(schema = "BUDDIGA_DEVELOPERS",name="PROJECTS_DATA")
@Entity
public class ProjectsData {

    @Id
    @Column(name="PRJCT_ID")
    private Long projectId;

    @Column(name = "PRJCT_NAME")
    private String projectName;

    @Column(name = "PRJCT_ADDRESS")
    private String projectAddress;

    @Column(name = "PRJCT_STATUS")
    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;

    @Column(name = "PRJCT_POSESSION")
    private String projectPossession;

    @Column(name="NO_OF_TOWERS")
    private Integer noOfTowers;

    @Column(name="NO_OF_FLOORS")
    private Integer noOfFloors;

    @Column(name="PRJCT_AREA")
    private Double projectAreaSqM;

    @Column(name="TOTAL_NO_OF_APTS")
    private Integer totalNoOfAprts;

    @Column(name="NO_OF_APTS_SOLD")
    private Integer noOfAprtsSold;

    @Column(name="NO_OF_APTS_AVL")
    private Integer noOfAprtsAvl;

    @Column(name="DIST_FRM_ARPT")
    private Double distFromAprtToCCKM;

    @Column(name="DIST_FRM_RAIL")
    private Double distFromRailKM;

    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;
}
