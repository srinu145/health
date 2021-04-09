package com.slokam.healthcare.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Visiting;


	@Repository
	public interface IVisitingRepo extends JpaRepository<Visiting, Integer> {
		/*
		public List<Visiting> getVisitingByPatientId(Integer id);
		*/
		
		
	 
	}


