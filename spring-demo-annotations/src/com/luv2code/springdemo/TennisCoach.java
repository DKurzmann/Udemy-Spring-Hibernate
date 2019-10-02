package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
	
	// define init method
	@PostConstruct
	public void doMyInitStuff() {
		System.out.println("inside doMyInitStuff");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("inside doMyCleanUpStuff");
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
