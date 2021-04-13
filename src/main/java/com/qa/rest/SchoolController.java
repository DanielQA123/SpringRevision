package com.qa.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistance.domain.SchoolDomain;
import com.qa.persistance.dtos.SchoolDTO;
import com.qa.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {

	private SchoolService service;

	@Autowired
	public SchoolController(SchoolService service) {
		super();
		this.service = service;
	}

	private Long id = 0L;
	private List<SchoolDomain> schoolList = new ArrayList<>();

	// REQUESTS => GET, POST, PUT, DELETE

	// GET:

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello world";
	}
	
	// REQUESTS => GET, POST, PUT, DELETE

	// GET => READ ALL:
	
// OLD METHOD of readALL/Get request: 
// ===> 
	
//	@GetMapping("/readAll")
//	public List<SchoolDomain> readAll() {
//		return schoolList;
//	}
	
	@GetMapping("/readAll")
	public ResponseEntity<List <SchoolDTO>> readAll() {
		return new ResponseEntity<List<SchoolDTO>>(this.service.readAll(), HttpStatus.ACCEPTED);
	}

	// GET => READ ID:

	@GetMapping("/read/{id}")
	public SchoolDomain readSchool(@PathVariable("id") Long id) {
		return schoolList.get(id.intValue());
	}

	// POST => CREATE:

//	@PostMapping("/create")
//	public boolean createSchool(@RequestBody SchoolDomain school) {
//		school.setId(id);
//		id++;
//		return schoolList.add(school);
//	}

	@PostMapping("/create")
	public ResponseEntity <SchoolDTO> createSchool(@RequestBody SchoolDomain school) {
		return new ResponseEntity<SchoolDTO>(this.service.create(school), HttpStatus.CREATED) ;
	}

	// PUT = UPDATE:

	@PutMapping("/update/{id}")
	public SchoolDomain updateSchool(@PathVariable("id") Long id, @RequestBody SchoolDomain school) {
		this.schoolList.remove(id.intValue());
		this.schoolList.add(id.intValue(), school);
		return this.schoolList.get(id.intValue());
	}

	// DELETE:

	@DeleteMapping("delete/{id}")
	public SchoolDomain deleteSchool(@PathVariable("id") Long id) {
		return schoolList.remove(id.intValue());
	}

}
