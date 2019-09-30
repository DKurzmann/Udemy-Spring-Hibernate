package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HandballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "15 min handplay";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
