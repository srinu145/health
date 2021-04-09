package com.slokam.healthcare.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.pojo.PatientSearchPojo;
import com.slokam.healthcare.repo.IPatientRepo;
import com.slokam.healthcare.repo.PatientCriteriaRepo;
import com.slokam.healthcare.service.IPatientService;
@Service
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private IPatientRepo patientRepo;
	
	@Autowired
	private PatientCriteriaRepo patientCriteria;
	
	@Override
	public void patientRegistration(Patient patient) {
		patient.setRegdate(new Date());
		patientRepo.save(patient);
	}
	
	@Override
	public List<Patient> criteriaTest(String name, String email) {
		return patientCriteria.patientSearch(name, email);
	}

	@Override
	public List<Patient> patientFullSearch(PatientSearchPojo searchPojo) {
		// TODO Auto-generated method stub
		return patientCriteria.patientFullSearch(searchPojo);
	}

	@Override
	public List<Patient> patientSearch(String name, String email) {
		// TODO Auto-generated method stub
		return patientCriteria.patientSearch(name, email);
	}

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}
}
