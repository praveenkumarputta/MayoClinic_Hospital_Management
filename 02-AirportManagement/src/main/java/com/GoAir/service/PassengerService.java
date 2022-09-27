package com.GoAir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GoAir.dao.PassengerRepository;
import com.GoAir.model.Passenger;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;

	public List<Passenger> getAllPassengersDetails() {
		return passengerRepository.findAll();
	}

	public Passenger savePassengersData(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	public List<Passenger> saveAllPassengersDetails(List<Passenger> passengers) {
		return passengerRepository.saveAll(passengers);
	}

	public String deletePassenger(Integer id) {
		passengerRepository.deleteById(id);
		return "Passenger removerd !!..";

	}

	public Passenger updatePassengerdata(Passenger passenger) {
		Passenger existingPassenger = passengerRepository.findById(passenger.getPnr()).orElse(null);
		existingPassenger.setEmail(passenger.getEmail());
		existingPassenger.setFrom(passenger.getFrom());
		existingPassenger.setPassengerName(passenger.getPassengerName());
		existingPassenger.setMobileNumber(passenger.getMobileNumber());
		existingPassenger.setJourneyDate(passenger.getJourneyDate());
		existingPassenger.setPnr(passenger.getPnr());
		existingPassenger.setTicketPrice(passenger.getTicketPrice());
		existingPassenger.setTo(passenger.getTo());

		return passengerRepository.save(existingPassenger);
	}
}
