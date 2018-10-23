package ch.newtype.harumscarum.fundament;

import ch.newtype.harumscarum.fundament.enums.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Truemmelbach
 */
public class Game {
	
	private final String name;
	private final Set<Platform> platforms;
	private final Set<Genre> genres;
	
	private int story = 0;
	private int gameplay = 0;
	private int graphics = 0;
	private int animation = 0;
	private int artwork = 0;
	
	private int innovation;
	private int duration;
	private int replayability;
	
	private int price;
	
	private List<GamePiece> gamePieces = new ArrayList<>();

	public Game(String name, Set<Platform> platforms, Set<Genre> genres) {
	    this.name = name;
	    this.platforms = platforms;
	    this.genres = genres;
    }

	public void addGamePiece(GamePiece newGamePiece) {
	    gamePieces.add(newGamePiece);
    }

    public void elaborateStory(int work) {
	    story = story + work;
    }

    public void improveGameplay(int work) {
	    gameplay = gameplay + work;
    }

}
