package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleDetailsNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    public Vehicle registerVehicle(Vehicle vehicle);
    public Vehicle getVehicleDetails(int id) throws VehicleDetailsNotFoundException;
    public Vehicle changeAvailabilty(int id) throws VehicleDetailsNotFoundException;
    public Vehicle acceptVehicleDetails(Vehicle vehicle);
    public Booking acceptBookingDetails(Booking booking);


}
