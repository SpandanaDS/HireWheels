package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.City;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cityDao")
public interface CityDao extends JpaRepository<City, Integer> {

}
