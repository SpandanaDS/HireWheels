package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleCategoryDao;
import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.entities.VehicleCategory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleDao vehicleDao;

    @Autowired
    VehicleCategoryDao vehicleCategoryDao;
    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleDao.findAll();
    }

    @Override
    public List<Vehicle> getAllVehicles(int id) {
        return vehicleDao.findAllById(Collections.singleton(id));
    }

    /*@Override
    public List<Vehicle> getAvailableVehicles(VehicleCategory vehicleCategory, Booking booking) {
        List<Vehicle> vehicles=vehicleCategoryDao.findAllById(vehicleCategory.getVehicleCategoryId());
    }*/

}
