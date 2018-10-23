package ch.newtype.harumscarum.studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import ch.newtype.harumscarum.fundament.GamePiece;
import ch.newtype.harumscarum.fundament.Person;
import ch.newtype.harumscarum.fundament.enums.GamePieceCategory;
import ch.newtype.harumscarum.fundament.enums.Gender;
import ch.newtype.harumscarum.fundament.enums.Skill;
import ch.newtype.harumscarum.util.Randomizer;

/**
 * @author Truemmelbach
 */
public class Developer extends Person {
	
	// die Erfahrung des Entwicklers drückt aus, wie stark er schon
	// an der Entwicklung von Spielen beteiligt war.
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
		int random = Randomizer.getRandomInt(2);
		// um die Anzahl an Entwicklern zu reduzieren, die einen BAD overallSkill haben, wird der beste aus 2 genommen
		random = Math.max(random, Randomizer.getRandomInt(2));
		// der overallSkill ist niemals NOTHING, sondern entweder BAD, POOR oder BEGINNER
		// - darum wird random inkrementiert
		random++;
		overallSkill = Skill.get(random);
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
		GamePiece gamePiece = new GamePiece(category, getCurrentSkill(category));
		experience.put(category, experience.get(category) + 1 );
		return gamePiece;
	}

	// berechnet den momentanen Skill für die angegebene category mit Einbezig von Gemütszustand und overallSkill
	private int getCurrentSkill(GamePieceCategory category) {
        // der Skill gibt an, pro wie vielen bytes statistisch betrachtet mit einem Fehler zu rechnen ist
        // er wird aus verschiedenen Faktoren berechnet
        int skill = skills.get(category).getLevel();
        int difference = Math.abs(overallSkill.getLevel() - skill);
        if (overallSkill.getLevel() > skill) {
            skill = skill + difference / 2;
        } else {
            skill = skill - difference / 2;
        }
        // skill ist jetzt in der Mitte zwischen dem spezifischen Skill und dem overall Skill
        // nun wird er noch mit dem Gemütszustand multipliziert
        // negative Gemütszustande erhöhen die Anzahl Fehler, positive reduzieren sie
        skill = (new Double(skill * getMood().getMultiplicator())).intValue();
        return skill;
    }
	
	private void initializeSkills() {
		skills = new HashMap<>();
		int skillsAboveOverall = 0;
		for (GamePieceCategory currentGamePieceCategory : GamePieceCategory.values()) {
			int random = Randomizer.getRandomInt(4);
			if (random * 10 > overallSkill.getLevel()) {
				if (skillsAboveOverall < 2) {
					// nur in maximal 2 Kategorien darf der Skill über dem overallSkill liegen
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
