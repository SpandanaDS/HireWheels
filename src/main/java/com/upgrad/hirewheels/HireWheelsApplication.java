package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.upgrad.hirewheels.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(HireWheelsApplication.class, args);
		UsersDao usersDao=context.getBean(UsersDao.class);
		Users users1=new Users();
		users1.setFirstName("Spandana");
		users1.setLastName("Dev");
		users1.setEmail("spa@gmail.com");
		users1.setPassword("qwerty");
		users1.setMobileNo("1234567890");
		users1.setRoleId(1);
		Users savedUser=usersDao.save(users1);
		System.out.println(savedUser);

		Users users2=new Users();
		users2.setFirstName("Vikram");
		users2.setEmail("v@gmail.com");
		users2.setPassword("asdf");
		users2.setMobileNo("7653390865");
		users2.setRoleId(1);

		Users users3=new Users();
		users3.setFirstName("Amogh");
		users3.setLastName("V");
		users3.setEmail("av@gmail.com");
		users3.setPassword("poutgh9");
		users3.setMobileNo("8996521908");
		users3.setRoleId(1);

		Users users4=new Users();
		users4.setFirstName("Blake");
		users4.setLastName("Lively");
		users4.setEmail("bl@gmail.com");
		users4.setPassword("klo87gf");
		users4.setMobileNo("9811234567");
		users4.setRoleId(1);

		Users users5=new Users();
		users5.setFirstName("Vancity");
		users5.setLastName("Reynolds");
		users5.setEmail("vc@gmail.com");
		users5.setPassword("9086654329");
		users5.setMobileNo("8976636918");
		users5.setRoleId(1);

		System.out.println(usersDao.saveAll(List.of(users1,users2,users3,users4,users5)).toString());


		System.out.println("Find By Firstname\n"+usersDao.findByFirstNameIgnoreCase("spandana"));
		System.out.println("Find by firstname or last name\n"+usersDao.findByFirstNameOrLastNameIgnoreCase("lively","dev"));
		System.out.println("Find By email\n"+usersDao.findByEmailIgnoreCase("av@gmail.com"));
		System.out.println("Find By mobile number\n"+usersDao.findByMobileNo("8976636918"));

		System.out.println("*************Finding first page of users*************");
		Page<Users> page0 = usersDao.findAll(PageRequest.of(0, 2));
		page0.stream().forEach(users -> System.out.println(users.toString()));

		System.out.println("*************Finding second page of users*************");
		Page<Users> page1 = usersDao.findAll(PageRequest.of(1, 2));
		page1.stream().forEach(users -> System.out.println(users.toString()));

	}

}
