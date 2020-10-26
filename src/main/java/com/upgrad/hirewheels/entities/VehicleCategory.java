package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleCategory {
    @Id
    private int vehicleCategoryId;

    @Column(nullable = false,unique = true)
    private String vehicleCategoryName;
}
