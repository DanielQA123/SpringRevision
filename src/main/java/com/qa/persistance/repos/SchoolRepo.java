package com.qa.persistance.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.qa.persistance.domain.SchoolDomain;

public interface SchoolRepo extends JpaRepository<SchoolDomain, Long> {

	//CRUD -> H2 database
	
}
