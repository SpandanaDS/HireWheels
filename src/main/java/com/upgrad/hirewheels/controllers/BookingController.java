package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.services.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    AdminService adminService;

    @PostMapping(value="/hirewheels/v1/bookings", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addBooking(@RequestBody BookingDTO bookingDTO){
        Booking addBooking=modelmapper.map(bookingDTO,Booking.class);
        Booking saveBooking=adminService.acceptBookingDetails(addBooking);
        return new ResponseEntity<>(saveBooking, HttpStatus.CREATED);
    }
}
