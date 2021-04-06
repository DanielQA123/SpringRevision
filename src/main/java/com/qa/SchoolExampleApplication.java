package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SchoolExampleApplication {

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(SchoolExampleApplication.class, args);
		
		System.out.println(beanBag.getBean("Note", String.class));
		System.out.println(beanBag.getBean("ServerStart", String.class));
	}

}
