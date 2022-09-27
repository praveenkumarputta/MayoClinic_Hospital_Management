package com.GoAir.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GoAir.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Serializable> {





}
