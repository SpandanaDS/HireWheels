package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersDao extends JpaRepository<Users, Integer> {
        public Users findByFirstNameIgnoreCase(String firstName);
       /* public Users findByFirstNameOrLastNameIgnoreCase(String firstname);*/
        public Users findByEmailIgnoreCase(String email);
        public Users findByMobileNo(String number);


    }
