package com.realestate.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "PROPERTY_DATA")
@Data
public class PropertyData {
    @Id
    @Column(name="PRPTY_ID")
    private Long propertyId;

    @Column(name = "PRJCT_ID")
    private Integer projectId;

    @Column(name="PRPTY_SQ_FT_AREA")
    private Double prptySqFtArea;

    @Column(name="TYPE_OF_BHKS")
    private String typeOfBHK;

    @Column(name = "PRICE_RANGE")
    private String priceRange;

    @Column(name = "PRPTY_FACING")
    private String propertyFacing;

    @Column(name = "CRE_TS")
    private Date createdAt;

    @Column(name = "UPDT_TS")
    private Date updatedAt;
}
