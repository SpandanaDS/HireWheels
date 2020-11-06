package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleCategoryDao")
public interface VehicleCategoryDao extends JpaRepository<VehicleCategory, Integer> {

   public VehicleCategory findByVehicleCategoryId(int id);
}
