package ch.newtype.harumscarum.fundament;

import java.util.HashSet;
import java.util.Set;

import ch.newtype.harumscarum.fundament.enums.Gender;
import ch.newtype.harumscarum.fundament.enums.Genre;
import ch.newtype.harumscarum.fundament.enums.Intelligence;
import ch.newtype.harumscarum.fundament.enums.Mood;

public class Person {
	
	// --- unveränderliche Attribute ---
	private final String firstname;
	private final String lastname;
	// für das Porträt-Bild macht es Sinn, das Geschlecht zu unterscheiden
	private final Gender gender;
	private final Intelligence intelligence;
	// bei Lieblings-Genres neigen Reviewer vielleicht dazu, anders zu bewerten - 
	// und Entwickler sind da vielleicht besonders auf Qualität bedacht
	private final Set<Genre> favoriteGenres;
	// Reviewer spielen nicht gerne Spiele, die sie sowieso nicht mögen - und
	// Entwickler arbeiten nicht gerne an Spielen die sie blöd finden
	private final Set<Genre> leastFavoriteGenres;
	
	// --- veränderliche Attribute ---
	private Mood mood;
	
	public Person() {
		this.gender = Gender.getRandomGender();
		this.firstname = Literals.getFirstname(gender);
		this.lastname = Literals.getRandomLastname();
		this.intelligence = Intelligence.getRandomIntelligence();
		this.mood = Mood.NEUTRAL;
		this.favoriteGenres = Genre.getRandomGenres();
		this.leastFavoriteGenres = Genre.getRandomGenresExcluding(favoriteGenres);
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public Mood getMood() {
		return mood;
	}

}
