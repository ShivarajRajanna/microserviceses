package com.example.demo.dto;

public class Patient {
	
	
	private Long patientid;
	
	private String name;
	private String address;
	private String contact;
	private String details;
	public Long getPatientid() {
		return patientid;
	}
	public void setPatientid(Long patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", details=" + details + "]";
	}
	
	
	
	

}
