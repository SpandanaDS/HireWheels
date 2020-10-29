package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDao extends JpaRepository<Users, Integer> {

}
