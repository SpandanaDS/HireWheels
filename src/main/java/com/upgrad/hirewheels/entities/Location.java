package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    private int locationId;

    @Column(nullable = false)
    private String locationName;

    @Column(nullable = false)
    private String address;

    @Column(length = 10,nullable = false)
    private int cityId;

    @Column(length = 6,nullable = false)
    private String pincode;
}
