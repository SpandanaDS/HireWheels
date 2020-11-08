package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.VehicleSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleSubcategoryDao")
public interface VehicleSubcategoryDao extends JpaRepository<VehicleSubcategory, Integer> {
    public VehicleSubcategory findByVehicleSubcategoryId(int id);
}
