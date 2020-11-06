package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    public Vehicle registerVehicle(Vehicle vehicle);

}
