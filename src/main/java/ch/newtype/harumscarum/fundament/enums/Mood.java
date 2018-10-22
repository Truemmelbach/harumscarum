package ch.newtype.harumscarum.fundament.enums;

public enum Mood {
	
	HOPELESS(0),
	ANGRY(10),
	PISSED(20),
	DOGGISH(30),
	BORED(40),
	NEUTRAL(50),
	ALLRIGHT(60),
	WELL(70),
	UPBEAT(80),
	ENERGETIC(90),
	HAPPY(100);
	
	int value;
	
	Mood(int value) {
		this.value = value;
	}

}
