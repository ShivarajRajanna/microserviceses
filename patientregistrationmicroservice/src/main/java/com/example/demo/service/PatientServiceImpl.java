package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient save(Patient patient) {
		
		
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getById(long id) {
		
		return patientRepository.findByPatientid(id);
	}

	@Override
	public List<Patient> findAll() {
		
		return patientRepository.findAll();
	}

	@Override
	public void delete(long id) {
		patientRepository.deleteById(id);
		
	}

}
