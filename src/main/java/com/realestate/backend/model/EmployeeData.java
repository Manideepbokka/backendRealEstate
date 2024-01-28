package com.realestate.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "EMP_DATA")
@Data
public class EmployeeData {

    @Id
    @Column(name="EMP_ID")
    private Long employeeId;

    @Column(name="EMP_NAME")
    private String employeeName;

    @Column(name="EMP_EMAIL")
    private String employeeEmail;

    @Column(name="NO_OF_CUST_DEALING")
    private Integer noOfCustDealing;

    @Column(name="NO_OF_SALES")
    private Integer noOfSales;

    @Column(name="COMM_ON_SLS")
    private Double commisionOnSales;

    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;
}
