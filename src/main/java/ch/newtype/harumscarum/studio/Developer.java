package ch.newtype.harumscarum.studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import ch.newtype.harumscarum.fundament.GamePiece;
import ch.newtype.harumscarum.fundament.Person;
import ch.newtype.harumscarum.fundament.enums.GamePieceCategory;
import ch.newtype.harumscarum.fundament.enums.Gender;
import ch.newtype.harumscarum.fundament.enums.Skill;

public class Developer extends Person {
	
	// die Erfahrung des Entwicklers drückt aus, wie stark er schon
	// an der Entwicklung von Spielen beteilitgt war.
	// Viel Erfahrung bedeutet nicht zwingend, dass er super gut ist, im Normalfall
	// sind erfahrene Entwickler aber tatsächlich besser als unerfahrene
	private int overallEperience;
	
	// wie gut ist dieser Entwickler über alles betrachtet?
	private Skill overallSkill;
	
	// wie gut ist dieser Entwickler in den verschiedenen Kategorien?
	// die Map speichert immer eine Verbindung aus GamePieceCategory und Skill
	private Map<GamePieceCategory, Skill> skills;
	
	// wie viel Erfahrung hat dieser Entwickler in den verschiedenen Kategorien?
	// je mehr Erfahrung, desto höher ist im Normalfall auch der Skill.
	private Map<GamePieceCategory, Integer> experience;

	public Developer() {
		skills = new HashMap<>();
		int random = new Random(System.currentTimeMillis()).nextInt(2);
		// take the best out of 2 to minimize the chances for someone being overall BAD
		random = Math.max(random, new Random(System.currentTimeMillis()).nextInt(2));
		// the overallSkill gets initialized with BAD, POOR or BEGINNER, not with NOTHING
		// that's why increment it
		random++;
		overallSkill = Skill.get(random);
		System.out.println("overallSkill is: " + overallSkill);
		initializeSkills();
		initializeExperience();
		overallEperience = 0;
	}

	public Skill getGamePieceCategorySkill(GamePieceCategory category) {
		return skills.get(category);
	}
	
	public void train(GamePieceCategory category, int levelIncrease) {
		
	}
	
	public GamePiece develop(GamePieceCategory category) {
		GamePiece gamePiece = new GamePiece(this, category);
		experience.put(category, experience.get(category) + 1 );
		return gamePiece;
	}
	
	private void initializeSkills() {
		skills = new HashMap<>();
		int skillsAboveOverall = 0;
		Random randomizer = new Random(System.currentTimeMillis());
		for (GamePieceCategory currentGamePieceCategory : GamePieceCategory.values()) {
			int random = randomizer.nextInt(4);
			System.out.println("random: " + random);
			if (random * 10 > overallSkill.getLevel()) {
				System.out.println("skill is above");
				if (skillsAboveOverall < 2) {
					// only 2 can be over OverallSkill
					skillsAboveOverall++;
				} else {
					random = overallSkill.getLevel()/10;
				}
			}
			skills.put(currentGamePieceCategory, Skill.get(random));
		}
	}
	
	private void initializeExperience() {
		experience = new HashMap<>();
		for (GamePieceCategory currentGamePieceCategory : GamePieceCategory.values()) {
			experience.put(currentGamePieceCategory, 0);
		}
	}
	
	public Skill getOverallSkill() {
		return overallSkill;
	}

}
