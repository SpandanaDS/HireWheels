package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(int pickupDate) {
        this.pickupDate = pickupDate;
    }

    public int getDropoffDate() {
        return dropoffDate;
    }

    public void setDropoffDate(int dropoffDate) {
        this.dropoffDate = dropoffDate;
    }

    public int getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(int bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", pickupDate=" + pickupDate +
                ", dropoffDate=" + dropoffDate +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                ", locationId=" + locationId +
                ", vehicleId=" + vehicleId +
                ", userId=" + userId +
                '}';
    }
}
