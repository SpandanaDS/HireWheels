package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookingDao")
public interface BookingDao extends JpaRepository<Booking, Integer> {

}
