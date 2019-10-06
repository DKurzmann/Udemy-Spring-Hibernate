package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrunkConfig {

	@Bean
	public FortuneService drunkFortuneService() {
		return new DrunkFortuneService();
	}
	
	@Bean
	public Coach flunkyballCoach() {
		return new FlunkyballCoach(drunkFortuneService());
	}
	
	
}
