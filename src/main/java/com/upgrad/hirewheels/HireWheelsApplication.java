package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.exceptions.UserDetailsNotFoundException;
import com.upgrad.hirewheels.exceptions.VehicleDetailsNotFoundException;
import com.upgrad.hirewheels.services.AdminService;
import com.upgrad.hirewheels.services.InitService;
import com.upgrad.hirewheels.services.InitServiceImpl;
import com.upgrad.hirewheels.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.upgrad.hirewheels.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) throws UserAlreadyExistsException, UserDetailsNotFoundException, VehicleDetailsNotFoundException {

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
		/*InitService initService=context.getBean(InitService.class);
		initService.start();*/

		UserService userService=context.getBean(UserService.class);
		AdminService adminService=context.getBean(AdminService.class);



/*

		Role admin=new Role();
		admin.setRoleName("ADMIN");
		admin=roleDao.save(admin);

		Role user = new Role();
		user.setRoleName("USER");
		user = roleDao.save(user);

		System.out.println("**************role***********");
		roleDao.findAll().forEach(System.out::println);
*/


	/*	Users users1=new Users();
		users1.setFirstName("Spandana");
		users1.setLastName("Dev");
		users1.setEmail("spa@gmail.com");
		users1.setPassword("qwerty");
		users1.setMobileNo("1234567890");
		users1.setRole(roleDao.findById(1).get());
		usersDao.save(users1);

		Users users2=new Users();
		users2.setFirstName("Vikram");
		users2.setEmail("v@gmail.com");
		users2.setPassword("asdf");
		users2.setMobileNo("7653390865");
		users2.setRole(roleDao.findById(2).get());
		usersDao.save(users2);

		Users users3=new Users();
		users3.setFirstName("Amogh");
		users3.setLastName("V");
		users3.setEmail("av@gmail.com");
		users3.setPassword("poutgh9");
		users3.setMobileNo("8996521908");
		users3.setRole(roleDao.findById(2).get());
		usersDao.save(users3);

		Users users4=new Users();
		users4.setFirstName("Blake");
		users4.setLastName("Lively");
		users4.setEmail("bl@gmail.com");
		users4.setPassword("klo87gf");
		users4.setMobileNo("9811234567");
		users4.setRole(roleDao.findById(2).get());
		usersDao.save(users4);

		Users users5=new Users();
		users5.setFirstName("Vancity");
		users5.setLastName("Reynolds");
		users5.setEmail("vc@gmail.com");
		users5.setPassword("9086654329");
		users5.setMobileNo("8976636918");
		users5.setRole(roleDao.findById(2).get());
		usersDao.save(users5);

		System.out.println();
		System.out.println("**************USERS***********");
		usersDao.findAll().forEach(System.out::println);


		System.out.println("Find By Firstname\n"+usersDao.findByFirstNameIgnoreCase("spandana"));
		System.out.println("Find by firstname or last name\n"+usersDao.findByFirstNameOrLastNameIgnoreCase("lively","dev"));
		System.out.println("Find By email\n"+usersDao.findByEmailIgnoreCase("av@gmail.com"));
		System.out.println("Find By mobile number\n"+usersDao.findByMobileNo("8976636918"));

		System.out.println("*************Finding first page of users*************");
		Page<Users> page0 = usersDao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.toString()));

		System.out.println("*************Finding second page of users*************");
		Page<Users> page1 = usersDao.findAll(PageRequest.of(1, 2));
		page1.stream().forEach(users -> System.out.println(users.toString()));*/

		/*Users users5=new Users();
		users5.setFirstName("spandana");
		users5.setLastName("dev");
		users5.setEmail("vc@gmail.com");
		users5.setPassword("908665yg");
		users5.setMobileNo("8976636909");
		users5.setRole(roleDao.findById(2).get());
		users5= userService.createUser(users5);

		Users users3=new Users();
		users3.setFirstName("Amogh");
		users3.setLastName("V");
		users3.setEmail("vc11@gmail.com");
		users3.setPassword("poutgh9");
		users3.setMobileNo("8976636967");
		users3.setRole(roleDao.findById(2).get());
		users3= userService.createUser(users3);


		System.out.println(userService.getUser("vc11@gmail.com","poutgh9"));*/


		cityDao.save(new City(1,"Mumbai"));

		Location location = new Location(1, "Worli",
				"Dr E Moses Rd, Worli Naka, Upper Worli",400018,cityDao.findById(1).get());
		locationDao.save(location);


		List<VehicleCategory> vehicleCategoryList = Arrays.asList(new VehicleCategory(10, "CAR"),
				new VehicleCategory(11,"BIKE"));
		vehicleCategoryDao.saveAll(vehicleCategoryList);

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

		List<FuelType> fuelTypeList = Arrays.asList(new FuelType(1,"Petrol"), new FuelType(2, "Diesel"));
		fuelTypeDao.saveAll(fuelTypeList);

		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleModel("Skoda Octavia");
		vehicle.setVehicleNumber("MH06YR0987");
		vehicle.setColor("white");
		vehicle.setFuelType(fuelTypeDao.findByFuelTypeId(10));
		vehicle.setLocation(locationDao.findByLocationId(2));
		vehicle.setVehicleImageUrl("https://color.com");
		vehicle.setVehicleSubcategory(vehicleSubcategoryDao.findByVehicleSubcategoryId(7));

		vehicle= adminService.registerVehicle(vehicle);

		adminService.changeAvailabilty(11);
	}


	}

