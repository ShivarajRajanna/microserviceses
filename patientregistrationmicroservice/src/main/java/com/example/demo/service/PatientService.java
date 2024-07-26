package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Patient;

public interface PatientService {
	
	public Patient save(Patient patient);
	public List<Patient> getById(long id);
	public List<Patient> findAll();
	public void delete(long id);
	
	

}
