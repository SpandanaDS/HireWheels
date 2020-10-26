package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleSubcategory {
    @Id
    private int vehicleSubcategoryId;

    @Column(nullable = false,unique = true)
    private String vehicleSubcategoryName;

    @Column(nullable = false)
    private int pricePerDay;

    @Column(nullable = false,length = 10)
    private int vehicleCategoryId;
}
