package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleDetailsNotFoundException;
import com.upgrad.hirewheels.services.AdminService;
import com.upgrad.hirewheels.services.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    AdminService adminService;

    @PostMapping(value="/hirewheels/v1/vehicles", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addVehicle(@RequestBody VehicleDTO vehicleDTO){
        Vehicle addVehicle=modelmapper.map(vehicleDTO,Vehicle.class);
        Vehicle saveVehicle=adminService.acceptVehicleDetails(addVehicle);
        return new ResponseEntity<>(saveVehicle, HttpStatus.CREATED);
    }

    @PutMapping(value = "/hirewheels/v1/vehicles/{vehicleid}")
    public ResponseEntity changeVehicleAvailability(@PathVariable(name = "vehicleid")int id,@RequestBody VehicleDTO vehicleDTO) throws VehicleDetailsNotFoundException {
            Vehicle vehicle=modelmapper.map(vehicleDTO,Vehicle.class);
            Vehicle updateVehicle=adminService.changeAvailabilty(id);
            return new ResponseEntity<>(updateVehicle,HttpStatus.OK);
    }

}


