package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {


	
	
	@Value("${foo.fortune1}")
	String a;
	
	@Value("${foo.fortune2}")
	String b;
	
	@Value("${foo.fortune3}")
	String c;
	
	String[] data = {a,b,c};

	

	
	@PostConstruct
	public void setFortunes(){
	data[0]=a;
	data[1]=b;
	data[2]=c;
	}


	@Override
	public String getFortune() {

		// pick a random string from the array
		Random random = new Random();
		int zufallszahl = random.nextInt(data.length);
		return data[zufallszahl];
	}

}
