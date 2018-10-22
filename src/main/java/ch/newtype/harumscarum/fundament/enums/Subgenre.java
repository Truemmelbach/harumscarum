package ch.newtype.harumscarum.fundament.enums;

public enum Subgenre {
	
	EGO_SHOOTER("Ego Shooter"),
	POINT_AND_CLICK("Point and Click"),
	RPG("RPG"),
	TAKTIKSHOOTER("Taktikshooter"),
	TEXTADVENTURE("Textadventure"),
	THIRD_PERSON_SHOOTER("3rd Person Shooter");
	
	private String name;
	
	private Subgenre(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
