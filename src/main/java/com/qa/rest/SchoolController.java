package com.qa.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistance.domain.SchoolDomain;

@RestController
@RequestMapping("/school")
public class SchoolController {
	
	private Long id = 0L;
	private List<SchoolDomain> schoolList = new ArrayList<>();
	
	//REQUESTS => GET, POST, PUT, DELETE
	
	//GET: 
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello world";
	}
	
	//GET => READ ALL: 
	
	@GetMapping("/readAll")
	public List<SchoolDomain> readAll(){
		return schoolList;
	}
	
	//GET => READ ID:
	
	@GetMapping("/read/{id}")
	public SchoolDomain readSchool(@PathVariable("id") Long id) {
		return schoolList.get(id.intValue());
	}
	
    //POST => CREATE:
	
	@PostMapping("/create")
	public boolean createSchool(@RequestBody SchoolDomain school) {
		school.setId(id);
		id++;
		return schoolList.add(school);
	}
	
	//PUT = UPDATE: 
	@PutMapping("/update/{id}")
	public SchoolDomain updateSchool(@PathVariable("id") Long id, @RequestBody SchoolDomain school ) {
		this.schoolList.remove(id.intValue());
		this.schoolList.add(id.intValue(), school);
		return this.schoolList.get(id.intValue());
	}
	
	
	
	
	//DELETE:
	
	
	
}
