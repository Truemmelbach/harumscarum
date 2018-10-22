package ch.newtype.harumscarum.fundament.enums;

import static ch.newtype.harumscarum.fundament.enums.Subgenre.EGO_SHOOTER;
import static ch.newtype.harumscarum.fundament.enums.Subgenre.POINT_AND_CLICK;
import static ch.newtype.harumscarum.fundament.enums.Subgenre.RPG;
import static ch.newtype.harumscarum.fundament.enums.Subgenre.TAKTIKSHOOTER;
import static ch.newtype.harumscarum.fundament.enums.Subgenre.TEXTADVENTURE;
import static ch.newtype.harumscarum.fundament.enums.Subgenre.THIRD_PERSON_SHOOTER;

import java.util.HashSet;
import java.util.Set;

import ch.newtype.harumscarum.util.Randomizer;

public enum Genre {

	ACTION("Action"), 
	ADVENTURE("Adventure", POINT_AND_CLICK, RPG, TEXTADVENTURE), 
	BEAT_EM_UP("Beat'em up"), 
	ECONOMY("Wirtschaftssimulation"), 
	GESCHICKLICHKEIT("Geschicklichkeit"), 
	JUMP_N_RUN("Jump'n'Run"), 
	KREATIV("Kreativ"), 
	LERNSPIEL("Lernspiel"), 
	RENNSPIEL("Rennspiel"), 
	SHOOTER("Shooter", EGO_SHOOTER, TAKTIKSHOOTER, THIRD_PERSON_SHOOTER), 
	SPORT("Sport"),
	STRATEGIE("Strategie");

	private String name;
	private Subgenre[] subgenres;

	private Genre(String name, Subgenre... subgenres) {
		this.name = name;
		this.subgenres = subgenres;
	}

	public String getName() {
		return name;
	}

	public Subgenre[] getSubgenre() {
		return subgenres;
	}

	public static Genre getRandomGenre() {
		int randomInt = Randomizer.getRandomInt(Genre.values().length);
		switch (randomInt) {
		case 0:
			return ACTION;
		case 1:
			return ADVENTURE;
		case 2:
			return BEAT_EM_UP;
		case 3:
			return ECONOMY;
		case 4:
			return GESCHICKLICHKEIT;
		case 5:
			return JUMP_N_RUN;
		case 6:
			return KREATIV;
		case 7:
			return LERNSPIEL;
		case 8:
			return RENNSPIEL;
		case 9:
			return SHOOTER;
		case 10:
			return SPORT;
		default:
			return STRATEGIE;
		}
	}
	
	public static Set<Genre> getRandomGenres() {
		Set<Genre> genres = new HashSet<>();
		int cycles = Randomizer.getRandomInt(4);
		cycles++;
		for (int i = 0; i < cycles; i++) {
			genres.add(getRandomGenre());
		}
		return genres;
	}

	public static Set<Genre> getRandomGenresExcluding(Set<Genre> genresToExclude) {
		Set<Genre> genres = getRandomGenres();
		Set<Genre> intersection = new HashSet<>(genres);
		intersection.retainAll(genresToExclude);
		while (intersection.size() > 0) {
			genres = getRandomGenres();
			intersection = new HashSet<>(genres);
			intersection.retainAll(genresToExclude);
		}
		return genres;
	}

}
