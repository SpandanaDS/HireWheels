package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    private int vehicleId;

    @Column(nullable = false)
    private String vehicleModel;

    @Column(length = 10,nullable = false)
    private String vehicleNumber;

    @Column(length = 10)
    private String vehicleSubcategoryId;

    @Column(nullable = false)
    private String color;

    @Column(length = 10,nullable = false)
    private int locationId;

    @Column(nullable = false,length = 10)
    private int fuelTypeId;

    @Column(length = 1,nullable = false)
    private int availabilityStatus;

    @Column(nullable = false)
    private String vehicleImageUrl;
}
