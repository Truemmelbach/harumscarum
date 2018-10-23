package ch.newtype.harumscarum.fundament.enums;

/**
 * Die Stimmung gibt an, in was für einer emotionalen Verfassung sich eine
 * Person befindet.
 *
 * @author Truemmelbach
 */
public enum Mood {
	
	HOPELESS(0.1),
	ANGRY(0.3),
	PISSED(0.5),
	DOGGISH(0.7),
	BORED(0.9),
	NEUTRAL(1),
	ALLRIGHT(1.1),
	WELL(1.2),
	UPBEAT(1.5),
	ENERGETIC(1.7),
	HAPPY(2);
	
	double multiplicator;
	
	Mood(double multiplicator) {
		this.multiplicator = multiplicator;
	}

	public double getMultiplicator() {
	    return multiplicator;
    }

	public Mood increase() {
		if (ordinal() == 10) {
			return this;
		} else {
			return values()[ordinal() + 1];
		}
	}

	public Mood decrease() {
		if (ordinal() == 0) {
			return this;
		} else {
			return values()[ordinal() - 1];
		}
	}

}
