package com.luv2code.springdemo;

public class CricketCoach implements Coach {

private FortuneService fortuneService;

private String emailAdress;

private String team;

//create no-arg constructor
public CricketCoach() {
System.out.println("CricketCoach: inside no-arg constructor");	
}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");	
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter method - setEmailAdress");	
		this.emailAdress=emailAdress;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");	
		this.team=team;
	}
	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}

}
