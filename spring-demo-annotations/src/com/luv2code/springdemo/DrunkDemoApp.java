package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrunkDemoApp {

	public static void main(String[] args) {
		// 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DrunkConfig.class);
		Coach theCoach = context.getBean("flunkyballCoach",Coach.class);
		System.out.println(theCoach.getDailyFortune());

	}

}
