 package com.GoAir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GoAir.model.Passenger;
import com.GoAir.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	private PassengerService passengerService;

	@GetMapping("/getAllPassengersData")
	public List<Passenger> getAllPassengersDetails() {
		return passengerService.getAllPassengersDetails();
	}

	@PostMapping("/addPassengerData")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
		return passengerService.savePassengersData(passenger);
	}

	@PostMapping("/addAllPassengers")
	public List<Passenger> addAllPassengers(@RequestBody List<Passenger> passengers) {
		return passengerService.saveAllPassengersDetails(passengers);
	}

	@DeleteMapping("/deletePassenger")
	public String deletePassenger(@PathVariable int id) {
		return passengerService.deletePassenger(id);

	}

	@PutMapping("/updatePassenger")
	public Passenger updatePassengerdata(@RequestBody Passenger passenger) {
		return passengerService.updatePassengerdata(passenger);
	}

}
