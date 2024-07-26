package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Doctor;

public interface DoctorServiceInterface {
	
	
	public Doctor save(Doctor doctor);
	public List<Doctor> getDoctorDetail(long id);
	public List<Doctor> getAllDoctorDetails();
	public void deleteDoctorDetails(long id);
	

}
