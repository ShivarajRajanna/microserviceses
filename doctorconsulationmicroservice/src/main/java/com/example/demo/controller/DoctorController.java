package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clientserver.DoctorFeignClient;
import com.example.demo.dto.Patient;
import com.example.demo.entity.Doctor;

import com.example.demo.service.DoctorServiceInterface;

import jakarta.servlet.http.HttpSession;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorServiceInterface doctorServiceInterface;
	
	@Autowired
	private DoctorFeignClient doctorFeignClient;
	
	@PostMapping("/doctor/")
	public Doctor saveDoctor(@RequestBody Doctor doctor)
	{
		Doctor doctor1=doctorServiceInterface.save(doctor);
		 List<Patient>  patient=doctorFeignClient.getPatient(doctor1.getPatientid());
		System.out.println(patient);
		return doctor1;
		
	}
	
	@GetMapping("/doctor/{id}")
	public List<Doctor> getDoctor(@PathVariable Long id)
	{
		List<Doctor> doctor1=doctorServiceInterface.getDoctorDetail(id);
		return doctor1;
	}
	@GetMapping("/doctor/")
	public List<Doctor> getAllDoctor()
	{
		List<Doctor> doctor1=doctorServiceInterface.getAllDoctorDetails();
		return doctor1;
	}
	
	@DeleteMapping("/doctor/{id}")
	public void deleteDoctor(@PathVariable Long id)
	{
		doctorServiceInterface.deleteDoctorDetails(id);
	}

}
