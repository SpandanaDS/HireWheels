package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class VehicleSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubcategoryId;

    @Column(nullable = false,unique = true)
    private String vehicleSubcategoryName;

    @Column(nullable = false)
    private int pricePerDay;

    @Column(nullable = false,length = 10)
    private int vehicleCategoryId;

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    @Override
    public String toString() {
        return "VehicleSubcategory{" +
                "vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", vehicleSubcategoryName='" + vehicleSubcategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", vehicleCategoryId=" + vehicleCategoryId +
                '}';
    }
}
