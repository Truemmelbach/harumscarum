package ch.newtype.harumscarum.fundament.enums;

import ch.newtype.harumscarum.util.Randomizer;

/**
 * @author Truemmelbach
 */
public enum Gender {

	MALE("männlich"), FEMALE("weiblich");

	private String description;

	private Gender(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public static Gender getRandomGender() {
		int randomInt = Randomizer.getRandomInt(2);
		switch (randomInt) {
		case 0:
			return MALE;
		default:
			return FEMALE;
		}
	}

}
