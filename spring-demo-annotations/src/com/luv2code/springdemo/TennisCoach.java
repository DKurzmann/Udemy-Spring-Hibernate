package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService thisFortuneService;
	
	/*
	@Autowired
	public TennisCoach(FortuneService thisFortuneService) {
		this.thisFortuneService = thisFortuneService;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
/* 	@Autowired
	public void doSomeCrazyStuff(FortuneService FortuneService) {
		System.out.println(">>TennisCoach: inside Setter");
		thisFortuneService = FortuneService;
	}
*/	
	@Override
	public String getDailyWorkout() {
		// 
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return thisFortuneService.getFortune();
	}

}
