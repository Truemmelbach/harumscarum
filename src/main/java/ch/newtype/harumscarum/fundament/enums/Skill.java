package ch.newtype.harumscarum.fundament.enums;

/**
 * @author Truemmelbach
 */
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
		return values()[skillLevel];
	}

	public Skill increase() {
		if (ordinal() == 10) {
			return this;
		} else {
			return values()[ordinal() + 1];
		}
	}

	public Skill decrease() {
		if (ordinal() == 0) {
			return this;
		} else {
			return values()[ordinal() - 1];
		}
	}

}
