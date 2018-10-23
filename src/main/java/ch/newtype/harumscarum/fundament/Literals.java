package ch.newtype.harumscarum.fundament;
import ch.newtype.harumscarum.fundament.enums.Gender;
import ch.newtype.harumscarum.util.Randomizer;

/**
 *
 * @author Truemmelbach
 */
public class Literals {
	
	private final static String[] LASTNAMES = {"Ackley", "Adams", "Ahern", "Allen", 
													  "Allgeier", "Anderson", "Augustin",
													  "Baer", "Baldwin", "Bates", "Bell",
													  "Bernstein", "Berry", "Billings", "Bilson",
													  "Blackley", "Blackman", "Blank",
													  "Bogost", "Boyarsky", "Bogost", "Breton",
													  "Brevik", "Brice", "Briggs", "Burch",
													  "Cabrera", "Cain", "Carmack", "Cartwright",
													  "Carver", "Castle", "Cawthon", "Cerny",
													  "Cheever", "Coleman", "Colin", "Crane",
													  "Cranford", "Cutter", "Daglow", "Dansky",
													  "Darin", "Davis", "Day", "Dille", "Dinehart",
													  "Dombrower", "Duncan", "Dyer", "Ellis",
													  "Emrich", "Erickson", "Fargo", "Farmer",
													  "Ferguson", "Flinn", "Fox", "Freeman",
													  "Fullerton", "Fulton", "Gaber", "Gage",
													  "Garriott", "Gates", "Gavin", "Gabelli",
													  "Gilbert", "Gingold", "Goldsmith", "Gomez",
													  "Goodman", "Gorlin", "Gray", "Green",
													  "Greenberg", "Grossman", "Hall", "Hallford",
													  "Harding", "Harris", "Hedlund", "Hensley",
													  "Hill", "Hills", "Hollis", "Honeychurch",
													  "Howard", "Huddy", "Iverson", "Irvine",
													  "Jackson", "Jacobs", "Jarvis", "Jenson",
													  "Jennings", "Johnson", "Jones", "Jordan",
													  "Kendall", "Kim", "Koster", "Kotok", "Kroegel",
													  "Kuenster", "Lantz", "Laurel", "Lennon",
													  "Levine", "Lobb", "Louie", "Lowe",
													  "Mandel", "Marsh", "McComb", "McCoy",
													  "McGee", "McMillen", "McQuaid", "Meier",
													  "Meretzky", "Metzen", "Michaels", "Mikros",
													  "Miller", "Muller", "Miranda", "Moriarty",
													  "Muir", "Mullich", "Murphy", "Nelson",
													  "Neubauer", "Newcomer", "Newell", "Norman",
													  "Orr", "Pacini", "Paladin", "Peterson",
													  "Porter", "Purcell", "Quinn", "Radoff",
													  "Ray", "Remo", "Reynolds", "Rogers",
													  "Romero", "Roper", "Roth", "Rouse", "Rubin",
													  "Salen", "Saltsman", "Santiago", "Saunders",
													  "Sawyer", "Schafer", "Schell", "Sega",
													  "Senn", "Shannon", "Sheffield", "Sheldon",
													  "Smart", "Smith", "Spector", "Sperry",
													  "Stout", "Stovall", "Swain", "Swanson",
													  "Swift", "Taylor", "Tiller", "Tobey",
													  "Todd", "Tylor", "Vanaman", "Vander",
													  "Vandermeer", "Verdu", "Vollmer", "Wade",
													  "Walton", "Wardell", "Warshaw", "Watson",
													  "Weisbecker", "Walls", "Wells", "Wesley",
													  "Williams", "Winnick", "Wolf", "Wright",
													  "Yob", "Yune", "Zender", "Zimmerman"};
	
	private final static String[] MALE_FIRSTNAMES = {"Aaron", "Abraham", "Alec", "Alvin",
													"Andrew", "Andy", "Anthony", "Archie",
													"Arnold", "Arthur", "Austin", "Ben",
													"Benjamin", "Bernard", "Blake", "Bud",
													"Calvin", "Carl", "Chad", "Charlie", "Clay",
													"Colin", "Corey", "Curtis", "Daniel", "Davy",
													"Derrick", "Dirk", "Donald", "Doug", "Douglas",
													"Dwight", "Ed", "Eddie", "Edgar", "Edmund",
													"Edward", "Edwin", "Elliot", "Emil", "Eric",
													"Ernest", "Ethan", "Fabian", "Felix", "Floyd",
													"Francis", "Frank", "Franklin", "Frederick",
													"Gabriel", "Gareth", "Garth", "Gerard", "Gilbert",
													"Gordon", "Grayham", "Grant", "Gregory", "Hal",
													"Hank", "Harold", "Harry", "Henry", "Herbert",
													"Harvey", "Hubert", "Hugh", "Ian", "Jack", "Jacob",
													"Jake", "James", "Jason", "Jasper", "Jay",
													"Jeb", "Jeff", "Jeffrey", "Jeremy", "Jerome", "Jerry",
													"Joel", "Joey", "Jonas", "Joseph", "Joshua", "Julian",
													"Justin", "Kay", "Keith", "Ken", "Kenneth", "Kenny",
													"Kevin", "Kian", "Kim", "Kimble", "Kurt", "Kyle",
													"Larry", "Laurence", "Leonard", "Lester", "Lewis",
													"Louis", "Linus", "Luther", "Malcolm", "Manuel",
													"Marcus", "Mark", "Marshall", "Martin", "Marvin",
													"Matt", "Matthew", "Maurice", "Maximilian", "Melvin",
													"Milo", "Nicolas", "Noel", "Norman", "Oscar", "Otto",
													"Owen", "Patrick", "Paul", "Pete", "Peter", "Philip",
													"Quentin", "Ralph", "Ray", "Raymond", "Randall",
													"Reginald", "Rex", "Richard", "Rick", "Rob", "Robert",
													"Rodger", "Ron", "Ronald", "Rowland", "Russell", "Samuel",
													"Sebastian", "Seth", "Shawn", "Shayne", "Simon", "Stephen",
													"Steve", "Tate", "Thomas", "Timmy", "Tobias", "Tony",
													"Travis", "Troy", "Valentine", "Waldo", "Walter", "William",
													"Winston", "Zack"};
			
	private final static String [] FEMALE_FIRSTNAMES = {"Abby", "Addison", "Adele", "Agnes", "Alaine",
													   "Alice", "Alisha", "Alison", "Amber", "Amy",
													   "Andrea", "Anna", "Annie", "April", "Ashley",
													   "Aubrey", "Avis", "Barbara", "Beatrice", "Becky",
													   "Belinda", "Bella", "Bertha", "Betty", "Blanche",
													   "Brenda", "Bridget", "Candy", "Carol", "Carolyn",
													   "Cassandra", "Cathleen", "Cathy", "Celinda", "Celia",
													   "Charlotte", "Cherry", "Chloe", "Christina", "Christy",
													   "Cindy", "Clara", "Cleo", "Cynthia", "Daisy", "Danielle",
													   "Deanna", "Debbie", "Delia", "Denise", "Dora", "Doreen",
													   "Drew", "Edith", "Edna", "Eileen", "Eleanor", "Eliza",
													   "Elizabeth", "Ella", "Ellen", "Ellie", "Emily", "Emma",
													   "Erika", "Estelle", "Esty", "Eva", "Eve", "Evelyn",
													   "Faith", "Fleur", "Flora", "Francie", "Frida", "Gail",
													   "Georgia", "Gertie", "Giselle", "Gwendolyn", "Gwyneth",
													   "Hannah", "Harriet", "Heather", "Heidi", "Helen", "Helena",
													   "Henrietta", "Hilda", "Holly", "Ida", "Imogen", "Iona",
													   "Irene", "Iris", "Isabella", "Ivy", "Jacqueline", "Jaime",
													   "Jana", "Jane", "Jemima", "Jenna", "Jennifer", "Joan",
													   "Joy", "Judith", "Julie", "June", "Karen", "Karina",
													   "Kathy", "Katie", "Kaylee", "Kim", "Kirsten", "Lana", "Lara",
													   "Laura", "Leila", "Leisha", "Lena", "Liana", "Lilla", "Linda",
													   "Lisa", "Louisa", "Lucy", "Lynnette", "Mabel", "Madelaine",
													   "Maggie", "Marcie", "Maria", "Marie", "Marsha", "Mary", "Maureen",
													   "May", "Megan", "Michelle", "Miranda", "Nadine", "Nancy", "Nicole",
													   "Nina", "Nora", "Olivia", "Patty", "Paula", "Poppy", "Priscilla",
													   "Rachel", "Rhoda", "Rita", "Roberta", "Rose", "Ruth", "Sabrina",
													   "Salma", "Samantha", "Sandra", "Sarah", "Sharon", "Sheryl", "Sophia",
													   "Stella", "Susan", "Sylviana", "Tammy", "Teresa", "Tracy", "Valerie",
													   "Vanessa", "Vilma", "Viola", "Vivian", "Wanda", "Wendy", "Whitney",
													   "Winnie", "Yasmin", "Yvette", "Yvonne", "Zelda"};
	
	public static String getRandomMaleFirstname() {
		return MALE_FIRSTNAMES[Randomizer.getRandomInt(MALE_FIRSTNAMES.length)];
	}
	
	public static String getRandomFemaleFirstname() {
		return FEMALE_FIRSTNAMES[Randomizer.getRandomInt(FEMALE_FIRSTNAMES.length)];
	}
	
	public static String getRandomLastname() {
		return LASTNAMES[Randomizer.getRandomInt(LASTNAMES.length)];
	}
	
	public static String getFirstname(Gender gender) {
		if (gender == Gender.MALE) {
			return getRandomMaleFirstname();
		} else {
			return getRandomFemaleFirstname();
		}
	}

}

