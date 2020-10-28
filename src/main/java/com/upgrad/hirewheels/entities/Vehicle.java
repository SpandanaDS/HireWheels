package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(String vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public int getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleSubcategoryId='" + vehicleSubcategoryId + '\'' +
                ", color='" + color + '\'' +
                ", locationId=" + locationId +
                ", fuelTypeId=" + fuelTypeId +
                ", availabilityStatus=" + availabilityStatus +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }
}
