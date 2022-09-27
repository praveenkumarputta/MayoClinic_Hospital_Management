package com.MayoClinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MayoClinic.model.Patient;
import com.MayoClinic.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/getAllPatientInformation")
	public List<Patient> getAllPatientDetails() {
		return patientService.getAllPatientDetails();
	}

	@GetMapping("/getAll")
	public List<Patient> getAllPatientDetailsList() {
		return patientService.getAllPatients();
	}

	@PostMapping("/addPatients")
	public List<Patient> saveAllPatientInformation(@RequestBody List<Patient> patient) {
		return patientService.saveAllPatientData(patient);
	}

	@PutMapping("/updataPatientData")

	public Patient updatePassengerData(@RequestBody Patient patient) {
		return patientService.updatePatientData(patient);
	}

	@DeleteMapping("/delete{id}")

	public String deleteAllPatients(@PathVariable int id) {
		return patientService.deletePatientData(id);
	}
}
