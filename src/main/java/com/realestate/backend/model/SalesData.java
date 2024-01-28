package com.realestate.backend.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name="SALES_DATA")
@Entity
public class SalesData {
    @Id
    @Column(name = "SALE_ID")
    private Long saleId;
    @Column(name = "CUST_ID")
    private Integer customerId;
    @Column(name = "EMP_ID")
    private Integer employeeId;
    @Column(name = "RVNUE_RCVD")
    private Double revenueRcvd;
    @Column(name = "RVNUE_YET_TO_COME")
    private Double revenueYetToCome;
    @Column(name = "POSESSION_DATE_AGRD")
    private Date posessionDtAgrdTo;
    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;
}
