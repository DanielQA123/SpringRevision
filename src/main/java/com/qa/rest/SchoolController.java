package com.qa.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {
	
	private Long id = 0L;
	private List<School> schoolList = new ArrayList<>();
	
	//REQUESTS => GET, POST, PUT, DELETE
	
	//GET: 
}
