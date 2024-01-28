package com.realestate.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "CASE_TABLE")
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
    private String caseProgress;

    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;

}

