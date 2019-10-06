package com.luv2code.springdemo;

public class FlunkyballCoach implements Coach {

	private FortuneService drunkFortuneService;
	
	public FlunkyballCoach(FortuneService theFortuneService) {
		drunkFortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "drink den scheiﬂ";
	}

	@Override
	public String getDailyFortune() {
		
		return drunkFortuneService.getFortune();
	}

}

