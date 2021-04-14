package com.qa.persistance.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistance.domain.DistrictDomain;

@Repository
public interface DistrictRepo extends JpaRepository<DistrictDomain, Long> {

	//CRUD -> H2 DATABASE
	
	//CREATE == POST
	//READ == GET
	//UPDATE == PUT
	//DELETE
}
