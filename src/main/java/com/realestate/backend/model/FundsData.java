package com.realestate.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name="FUNDS_DATA")
@Entity
public class FundsData {
    @Id
    @Column(name = "FUND_ID")
    private Long fundId;
    @Column(name = "PRJCT_ID")
    private Long projectId;
    @Column(name = "FUND_EST_TO_CMLT_PROJ")
    private Double fundsEstToComProject;
    @Column(name = "FUND_SPNT_TILL_DT")
    private Double fundsSpntTillDt;
    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;
}
