package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.entities.VehicleCategory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VehicleService {
    public List<Vehicle> getAllVehicles();
    public List<Vehicle> getAllVehicles(int id);
    public List<Vehicle> getAvailableVehicles(VehicleCategory vehicleCategory, Booking booking);

}
