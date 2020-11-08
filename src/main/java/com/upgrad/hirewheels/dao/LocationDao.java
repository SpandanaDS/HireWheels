package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Location;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("locationDao")
public interface LocationDao extends JpaRepository<Location, Integer> {
    public Location findByLocationId(int id);
}
