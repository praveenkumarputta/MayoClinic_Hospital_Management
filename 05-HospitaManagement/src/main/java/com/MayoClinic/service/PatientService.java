package com.MayoClinic.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MayoClinic.dao.PatientRepository;
import com.MayoClinic.model.Patient;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAllPatientDetails() {
		return patientRepository.findAll();
	}

	public List<Patient> getAllPatients() {
		return patientRepository.findAll().stream().sorted(Comparator.comparing(Patient::getAge))
				.collect(Collectors.toList());

	}

	public List<Patient> saveAllPatientData(List<Patient> patients) {
		return patientRepository.saveAll(patients);
	}

	public Patient updatePatientData(Patient patient) {
		Patient existingPatient = patientRepository.findById(patient.getAge()).orElse(null);

		existingPatient.setAge(patient.getAge());
		existingPatient.setCity(patient.getCity());
		existingPatient.setDischargeDate(patient.getDischargeDate());
		existingPatient.setEmailAddress(patient.getEmailAddress());
		existingPatient.setJoiningDate(patient.getJoiningDate());
		existingPatient.setPayment(patient.getPayment());
		existingPatient.setPaymentType(patient.getPaymentType());
		existingPatient.setPhoneNumber(patient.getPhoneNumber());
		existingPatient.setPrimaryLanguage(patient.getPrimaryLanguage());
		existingPatient.setSex(patient.getSex());
		existingPatient.setPatientName(patient.getPatientName());
		return existingPatient;

	}

	public String deletePatientData(Integer id) {
		patientRepository.deleteById(id);
		return "Patient data removed...!!";

	}
}
