package com.example.demo.clientserver;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.dto.Patient;

@FeignClient("ApiGateWay")
public interface DoctorFeignClient {
	
	@GetMapping("/patient/{id}")
	public  List<Patient>  getPatient(@PathVariable("id") long id);
	
}
