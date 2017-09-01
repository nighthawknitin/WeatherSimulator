package com.app.weatherSimulatorApp.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

	
	public static int randInt(int min, int max) {
		
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

	    return randomNum;
	}
}
