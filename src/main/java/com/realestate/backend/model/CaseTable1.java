package com.realestate.backend.model;

import com.realestate.backend.model.enums.CaseStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(schema = "BUDDIGA_DEVELOPERS",name = "CASE_TABLE")
@Data
public class CaseTable1 {

    @Id
    @Column(name = "CASE_ID")
    private Long caseId;

    @Column(name = "EMP_ID")
    private String employeeId;

    @Column(name = "CUST_ID")
    private String customerId;

    @Column(name = "QUERY")
    private String query;

    @Column(name = "CASE_PRGRS")
    @Enumerated(EnumType.STRING)
    private CaseStatus caseProgress;

    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;

}

