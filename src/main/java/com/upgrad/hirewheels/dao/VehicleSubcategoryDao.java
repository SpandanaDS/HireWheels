package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.VehicleSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleSubcategoryDao extends JpaRepository<VehicleSubcategory, Integer> {

}
