package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;


@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	
    @PostMapping("/patient/")
    public Patient savePatient(@RequestBody Patient patient)
    {
    	Patient patient1=patientService.save(patient);
    	
    	return patient1;
    }
    
    @GetMapping("/patient/{id}")
    public List<Patient> findPatient(@PathVariable long id)
    {
    	List<Patient> patient1=patientService.getById(id);
    	
    	return patient1;
    }
    
    @GetMapping("/patient/")
    public List<Patient> findAllPatient()
    {
    	List<Patient>patients=patientService.findAll();
    	
    	return patients;
    	
    }
    @DeleteMapping("/patient/{id}")
    public void deletePatient(@PathVariable long id)
    {
    	patientService.delete(id);
    	
    	
    	
    }
}
