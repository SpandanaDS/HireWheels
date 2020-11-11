package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.exceptions.UserDetailsNotFoundException;
import com.upgrad.hirewheels.exceptions.VehicleDetailsNotFoundException;
import com.upgrad.hirewheels.services.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.upgrad.hirewheels.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		UsersDao usersDao = context.getBean(UsersDao.class);
		RoleDao roleDao = context.getBean(RoleDao.class);
		BookingDao bookingDao = context.getBean(BookingDao.class);
		CityDao cityDao = context.getBean(CityDao.class);
		FuelTypeDao fuelTypeDao = context.getBean(FuelTypeDao.class);
		LocationDao locationDao = context.getBean(LocationDao.class);
		VehicleDao vehicleDao = context.getBean(VehicleDao.class);
		VehicleCategoryDao vehicleCategoryDao = context.getBean(VehicleCategoryDao.class);
		VehicleSubcategoryDao vehicleSubcategoryDao = context.getBean(VehicleSubcategoryDao.class);

		AdminService adminService=context.getBean(AdminService.class);
		InitService initService=context.getBean(InitService.class);
		initService.start();

	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}

