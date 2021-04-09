package com.slokam.healthcare.service;

import java.util.List;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.pojo.PatientSearchPojo;

public interface IPatientService {
	 public void patientRegistration(Patient patient);
	 public List<Patient> criteriaTest(String name , String email);
	 public List<Patient> patientFullSearch(PatientSearchPojo searchPojo);
	 public List<Patient> patientSearch(String name, String email);
	 public List<Patient> getAll();
	 
	
}
