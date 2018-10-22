package ch.newtype.harumscarum.util;

import java.util.Random;

public class Randomizer {
	
	private static Random randomizer = new Random(System.currentTimeMillis());
	
	public static int getRandomInt(int bound) {
		return randomizer.nextInt(bound);
	}

}
