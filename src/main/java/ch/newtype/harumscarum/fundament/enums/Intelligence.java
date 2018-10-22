package ch.newtype.harumscarum.fundament.enums;

import ch.newtype.harumscarum.util.Randomizer;

public enum Intelligence {
	
	STUPID(70),
	DUMB(80),
	SLOW(90),
	AVERAGE(100),
	SMART(110),
	INTELLIGENT(120),
	VERY_INTELLIGENT(130),
	HIGHLY_INTELLIGENT(140),
	GENIUS(150);
	
	private int iq;
	
	private Intelligence(int iq) {
		this.iq = iq;
	}
	
	public int getIq() {
		return iq;
	}
	
	public static Intelligence getRandomIntelligence() {
		int randomInt = Randomizer.getRandomInt(Intelligence.values().length);
		randomInt = randomInt + 7;
		switch (randomInt) {
		case 7:
			return STUPID;
		case 8:
			return DUMB;
		case 9:
			return SLOW;
		case 10:
			return AVERAGE;
		case 11:
			return SMART;
		case 12:
			return INTELLIGENT;
		case 13:
			return VERY_INTELLIGENT;
		case 14:
			return HIGHLY_INTELLIGENT;
		default:
			return GENIUS;
		}
	}

}
