package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.FuelType;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("fuelTypeDao")
public interface FuelTypeDao extends JpaRepository<FuelType, Integer> {

}
