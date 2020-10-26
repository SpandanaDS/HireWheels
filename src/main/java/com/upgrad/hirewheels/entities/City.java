package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    private int cityId;

    @Column(nullable = false)
    private String cityName;
}
