package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FuelType {
    @Id
    private int fuelTypeId;

    @Column(nullable = false,unique = true)
    private String fuelType;
}
