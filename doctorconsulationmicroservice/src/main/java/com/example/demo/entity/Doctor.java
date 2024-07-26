package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doctorid; 
	private long patientid;
	private String observation;
	private String doctorname;
	private String medication;
	public long getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(long doctorid) {
		this.doctorid = doctorid;
	}
	public long getPatientid() {
		return patientid;
	}
	public void setPatientid(long patientid) {
		this.patientid = patientid;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	@Override
	public String toString() {
		return "Doctor [doctorid=" + doctorid + ", patientid=" + patientid + ", observation=" + observation
				+ ", doctorname=" + doctorname + ", medication=" + medication + "]";
	}
	
	
	
}
