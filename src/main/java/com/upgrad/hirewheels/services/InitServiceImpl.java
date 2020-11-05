package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InitServiceImpl implements InitService {

    @Autowired
    RoleDao roleDao;

    @Autowired
    UsersDao usersDao;

    @Autowired
    VehicleCategoryDao vehicleCategoryDao;

    @Autowired
    VehicleSubcategoryDao vehicleSubcategoryDao;

    @Autowired
    CityDao cityDao;

    @Autowired
    FuelTypeDao fuelTypeDao;

    @Autowired
    LocationDao locationDao;


    public void start() {
        addUserRole();
        addUsers();
        addVehicleCategory();
        addVehicleSubCategory();
        addCity();
        addFuelType();
        addLocation();
    }

    private void addLocation() {
        Location location = new Location(1, "Worli",
                "Dr E Moses Rd, Worli Naka, Upper Worli",400018,cityDao.findById(1).get());
        locationDao.save(location);
        location = new Location(2, "Chembur",
                "Optic Complex",400019,cityDao.findById(1).get());
        locationDao.save(location);
        location = new Location(3, "Powai",
                "Hiranandani Tower",400020,cityDao.findById(1).get());
        locationDao.save(location);
    }

    private void addFuelType() {
        List<FuelType> fuelTypeList = Arrays.asList(new FuelType(1,"Petrol"), new FuelType(2, "Diesel"));
        fuelTypeDao.saveAll(fuelTypeList);
    }

    private void addCity() {
        cityDao.save(new City(1,"Mumbai"));
    }

    private void addVehicleCategory() {
        List<VehicleCategory> vehicleCategoryList = Arrays.asList(new VehicleCategory(10, "CAR"),
                new VehicleCategory(11,"BIKE"));
        vehicleCategoryDao.saveAll(vehicleCategoryList);
    }

    private void addVehicleSubCategory() {
        List<VehicleSubcategory> vehicleSubcategories = new ArrayList<>();

        vehicleSubcategories.add(new VehicleSubcategory(1, "SUV",
                300,vehicleCategoryDao.findByVehicleCategoryId(10) ));

        vehicleSubcategories.add(new VehicleSubcategory(2, "SEDAN",
                350,vehicleCategoryDao.findByVehicleCategoryId(10) ));

        vehicleSubcategories.add(new VehicleSubcategory(3, "HATCHBACK",
                250,vehicleCategoryDao.findByVehicleCategoryId(10) ));

        vehicleSubcategories.add(new VehicleSubcategory(4, "CRUISER",
                200,vehicleCategoryDao.findByVehicleCategoryId(11) ));

        vehicleSubcategories.add(new VehicleSubcategory(5, "DIRT BIKE",
                200,vehicleCategoryDao.findByVehicleCategoryId(11) ));

        vehicleSubcategories.add(new VehicleSubcategory(6, "SPORTS BIKE",
                150,vehicleCategoryDao.findByVehicleCategoryId(11) ));

        vehicleSubcategoryDao.saveAll(vehicleSubcategories);
    }

    private void addUserRole() {

        List<Role> RoleList = Arrays.asList(new Role(1, "Admin"),
                new Role(2,"User"));
        roleDao.saveAll(RoleList);
    }


    private void addUsers() {
        Users adminUser = new Users("Upgrad","Admin","admin@123","upgrad@gmail.com",
                "9999999999", 10000,roleDao.findByRoleId(1));
        usersDao.save(adminUser);
    }

}