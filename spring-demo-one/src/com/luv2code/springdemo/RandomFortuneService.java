package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {


	public String Spruch1;
	public String Spruch2;
	public String Spruch3;
	
	String[] fortuneList= new String[3];

	
	Random random = new Random();
	
	@Override
	public String getFortune() {
		int zufallszahl= random.nextInt(fortuneList.length);
		String spruch=fortuneList[zufallszahl];
		return spruch;

	}
	public void setSpruch1(String spruch1) {	
		fortuneList[0]= spruch1;
		this.Spruch1 = spruch1;
	}

	public void setSpruch2(String spruch2) {
		fortuneList[1]= spruch2;
		this.Spruch2 = spruch2;
	}

	public void setSpruch3(String spruch3) {	
		fortuneList[2]= spruch3;
		this.Spruch3 = spruch3;
	}
}