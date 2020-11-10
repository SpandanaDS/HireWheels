package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.services.BookingService;
import com.upgrad.hirewheels.services.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    BookingService bookingService;

    @GetMapping(value= {"/hirewheels/v1/vehicles"})
    public ResponseEntity getVehicles() {
        List<Vehicle> vehicleList=vehicleService.getAllVehicles();
        List<VehicleDTO> vehicleDTOList=new ArrayList<>();
        for(Vehicle vehicle:vehicleList){
            vehicleDTOList.add(modelmapper.map(vehicle,VehicleDTO.class));
        }
        return new ResponseEntity<>(vehicleDTOList,HttpStatus.OK);
    }
    @GetMapping(value= {"/hirewheels/v1/vehicles"})
    public ResponseEntity getVehicles(@RequestParam(name = "categoryName") String categoryName, @RequestParam(name="pickUpDate")Date pickUpDate,@RequestParam(name="dropDate") Date dropDate,@RequestParam(name="locationId") int locationId) {
        List<Vehicle> vehicleList=vehicleService.getAllVehicles();
        List<VehicleDTO> vehicleDTOList=new ArrayList<>();
        for(Vehicle vehicle:vehicleList){
            if(vehicle.getVehicleSubcategory().equals(categoryName)&& vehicle.getLocation().equals(locationId) && vehicle.getBookings().equals(pickUpDate) && vehicle.getBookings().equals(dropDate)) {
                vehicleDTOList.add(modelmapper.map(vehicle, VehicleDTO.class));
            }
            else{
                return null;
            }
        }
        return new ResponseEntity<>(vehicleDTOList,HttpStatus.OK);
    }

}
