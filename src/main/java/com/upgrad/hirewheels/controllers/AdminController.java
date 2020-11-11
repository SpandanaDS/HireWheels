package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleDetailsNotFoundException;
import com.upgrad.hirewheels.services.AdminService;
import com.upgrad.hirewheels.services.VehicleService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/hirewheels/v1")
public class AdminController {

    private static  final Logger logger= LoggerFactory.getLogger(AdminController.class);

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    AdminService adminService;

    @PostMapping(value="/vehicles", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addVehicle(@RequestBody VehicleDTO vehicleDTO){
        Vehicle addVehicle=modelmapper.map(vehicleDTO,Vehicle.class);
        Vehicle saveVehicle=adminService.acceptVehicleDetails(addVehicle);
        logger.debug("Accepted new vehicle details",saveVehicle);
        return new ResponseEntity<>(saveVehicle, HttpStatus.CREATED);
    }

    @PutMapping(value = "/vehicles/{vehicleid}",consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeVehicleAvailability(@PathVariable(name = "vehicleid")int id,@RequestBody VehicleDTO vehicleDTO) throws VehicleDetailsNotFoundException {
        logger.debug("Updated availability status:"+id,vehicleDTO);
            Vehicle vehicle=modelmapper.map(vehicleDTO,Vehicle.class);
            Vehicle updateVehicle=adminService.changeAvailabilty(id);
            return new ResponseEntity<>(updateVehicle,HttpStatus.OK);
    }

}


