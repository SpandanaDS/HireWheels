package com.upgrad.hirewheels.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
public class Booking {
    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @Column(name="pickup_date",nullable = false)
    private int pickupDate;

    @Column(name="dropoff_date",nullable = false)
    private int dropoffDate;

    @Column(name="booking_date",nullable = false)
    private int bookingDate;

    @Column(nullable = false)
    private float amount;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "location_id",nullable = false)
    private Location location;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "vehicle_id",nullable = false)
    private Vehicle vehicle;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users user;

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", pickupDate=" + pickupDate +
                ", dropoffDate=" + dropoffDate +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                ", location=" + location +
                ", vehicle=" + vehicle +
                ", user=" + user +
                '}';
    }

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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}