package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    private int bookingId;

    @Column(nullable = false)
    private int pickupDate;

    @Column(nullable = false)
    private int dropoffDate;

    @Column(nullable = false)
    private int bookingDate;

    @Column(nullable = false)
    private int amount;

    @Column(length = 10,nullable = false)
    private int locationId;

    @Column(nullable = false)
    private int vehicleId;

    @Column(nullable = false)
    private int userId;
}
