package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.BookingDao;
import com.upgrad.hirewheels.dao.VehicleCategoryDao;
import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.entities.VehicleCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService{

    @Qualifier("vehicleDao")
    @Autowired
    VehicleDao vehicleDao;

    @Qualifier("bookingDao")
    @Autowired
    BookingDao bookingDao;

    @Qualifier("vehicleCategoryDao")
    @Autowired
    VehicleCategoryDao vehicleCategoryDao;

    @Autowired
    VehicleService vehicleService;

    @Override
    public List<Vehicle> getAllVehicles() {

        List<Vehicle> vehicleList=vehicleDao.findAll();
        return vehicleList;
    }

    @Override
    public List<Vehicle> getAllVehicles(int id) {
       return vehicleDao.findAllById(Collections.singleton(id));
    }

    @Override
    public List<Vehicle> getAvailableVehicles(VehicleCategory vehicleCategory, Booking booking) {
        return null;
    }


}
