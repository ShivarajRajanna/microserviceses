package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;

import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorServiceInterface {
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor save(Doctor doctor) {
		
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getDoctorDetail(long id) {
		
		return doctorRepository.findByDoctorid(id);
	}

	@Override
	public List<Doctor> getAllDoctorDetails() {
		
		return doctorRepository.findAll();
	}

	@Override
	public void deleteDoctorDetails(long id) {
		doctorRepository.deleteById(null);

	}

	
}
