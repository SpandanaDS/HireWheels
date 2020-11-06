package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository("usersDao")
public interface UsersDao extends JpaRepository<Users, Integer> {
        public Users findByFirstNameIgnoreCase(String firstName);
        public Users findByFirstNameOrLastNameIgnoreCase(String firstName, String lastName);
        public Optional<Users> findByEmailIgnoreCase(String email);
        public Optional<Users> findByMobileNo(String number);


    }
