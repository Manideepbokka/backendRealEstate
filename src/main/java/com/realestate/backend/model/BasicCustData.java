package com.realestate.backend.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "BASIC_CUST_DATA")
@Data
public class BasicCustData {

    @Id
    @Column(name = "CUST_ID")
    private Long custId;

    @Column(name = "IND_FN")
    private String firstName;

    @Column(name = "IND_LN")
    private String lastName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NO")
    private String phoneNumber;

    @Column(name = "SALARY_PM")
    private double salaryPerMonth;

    @Column(name = "CUST_IND_BUD")
    private double customerIndividualBudget;

    @Column(name = "NO_OF_DEPENDENTS")
    private int numberOfDependents;

    @Column(name = "NOMINEE")
    private String nominee;

    @Column(name = "CUST_ADHAR")
    private String customerAadhar;

    @Column(name = "CUST_PAN")
    private String customerPan;

    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;

}

