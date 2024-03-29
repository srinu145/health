package com.slokam.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.pojo.PatientSearchPojo;
import com.slokam.healthcare.service.IPatientService;

@RestController
@RequestMapping("patient")
public class PatientController {

	@Autowired
	private IPatientService patientService;

	@PostMapping("/register")
	public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient) {

		patientService.patientRegistration(patient);
		return new ResponseEntity<Patient>(patient, HttpStatus.CREATED);
	}

	@GetMapping("/criteriaTest/{name}/{email}")
	public ResponseEntity<List<Patient>> criteriaTest(@PathVariable String name, @PathVariable String email) {
		List<Patient> list = patientService.criteriaTest(name, email);
		return new ResponseEntity<List<Patient>>(list, HttpStatus.OK);
	}

	@PostMapping("/fullsearch")
	public ResponseEntity<List<Patient>> patientFullSearch(@RequestBody PatientSearchPojo searchPojo) {
		List<Patient> list = patientService.patientFullSearch(searchPojo);
		return ResponseEntity.ok(list);
	}
	@PostMapping("/search")
	public ResponseEntity<List<Patient>> patientSearch(@RequestBody String name, String email) {
		List<Patient> list = patientService.patientSearch(name,email);
		return ResponseEntity.ok(list);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Patient>> getAll() {
		List<Patient> list = patientService.getAll();
		return ResponseEntity.ok(list);
	}
	

}
