package ch.newtype.harumscarum.fundament;

import ch.newtype.harumscarum.fundament.enums.GamePieceCategory;
import ch.newtype.harumscarum.fundament.enums.Skill;
import ch.newtype.harumscarum.studio.Developer;

/**
 * Ein Game besteht aus einer Anzahl an GamePieces. Anzahl und Zusammensetzung variiert von Game zu
 * Game. Je nachdem, was gefordert ist.
 * Jedes GamePiece besteht aus einer Reihe von Bytes. True steht dabei für korrekt, false für fehlerhaft.
 * Je besser ein Developer, desto weniger Fehler gibt es.
 *
 */
public class GamePiece {
	
	private boolean[] bytes;
	
	private GamePieceCategory category;
	
	public GamePiece(Developer developer, GamePieceCategory category) {
		Skill overallSkill = developer.getOverallSkill();
		Skill developerSkill = developer.getGamePieceCategorySkill(category);
	}

}
