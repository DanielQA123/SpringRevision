package com.qa.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public String Note() {
		return "Hello World!!";
	}
	
	@Bean
	public String ServerStart() {
		return LocalTime.now().toString();
	}
	
	

}
