package ch.newtype.harumscarum.fundament.enums;

import ch.newtype.harumscarum.util.Randomizer;

/**
 * @author Truemmelbach
 */
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
		return values()[randomInt];
	}

}
