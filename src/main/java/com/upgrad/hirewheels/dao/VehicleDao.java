package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleDao")
public interface VehicleDao extends JpaRepository<Vehicle, Integer> {
        public Vehicle findByVehicleId(int id);
}
