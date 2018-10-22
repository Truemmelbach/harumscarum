package ch.newtype.harumscarum.fundament.enums;

public enum Skill {

	NOTHING(0), BAD(10), POOR(20), BEGINNER(30), JUNIOR(40), DEVELOPER(50), ADVANCED(60), EXPERIENCED(70), PROFESSIONAL(
			80), SENIOR(90), EXPERT(100);

	private int level;

	private Skill(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public static Skill get(int skillLevel) {
		switch (skillLevel) {
		case 0:
			return NOTHING;
		case 1:
			return BAD;
		case 2:
			return POOR;
		case 3:
			return BEGINNER;
		case 4:
			return JUNIOR;
		case 5:
			return DEVELOPER;
		case 6:
			return ADVANCED;
		case 7:
			return EXPERIENCED;
		case 8: 
			return PROFESSIONAL;
		case 9:
			return SENIOR;
		case 10:
			return EXPERT;
		default:
			return NOTHING;
		}
	}

}
