package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		Random random = new Random();
		int zufallszahl = random.nextInt(data.length);
		return data[zufallszahl];
	}

}
