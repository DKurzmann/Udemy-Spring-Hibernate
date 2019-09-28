package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	String Spruch1;
	String Spruch2;
	String Spruch3;
	
	String[] fortuneList= {Spruch1,Spruch2,Spruch3};

	
	Random random = new Random();
	
	@Override
	public String getFortune() {
		return fortuneList[random.nextInt(fortuneList.length-1)];
	}

}




