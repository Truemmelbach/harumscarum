package ch.newtype.harumscarum.fundament.enums;

public enum Theme {
	
	COMEDY("Comedy"),
	FANTASY("Fantasy"),
	GESCHICHTE("Geschichte"),
	HORROR("Horror"),
	KRIEG("Krieg"),
	KRIMI("Krimi"),
	SCIENCE_FICTION("Science Fiction");
	
	private String name;
	
	private Theme(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
