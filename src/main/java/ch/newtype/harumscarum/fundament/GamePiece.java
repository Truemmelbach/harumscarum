package ch.newtype.harumscarum.fundament;

import ch.newtype.harumscarum.fundament.enums.GamePieceCategory;
import ch.newtype.harumscarum.fundament.enums.Mood;
import ch.newtype.harumscarum.fundament.enums.Skill;
import ch.newtype.harumscarum.studio.Developer;
import ch.newtype.harumscarum.util.Randomizer;

/**
 * Ein Game besteht aus einer Anzahl an GamePieces. Anzahl und Zusammensetzung variiert von Game zu
 * Game. Je nachdem, was gefordert ist.
 * Jedes GamePiece besteht aus einer Reihe von Bytes. True steht dabei für korrekt, false für fehlerhaft.
 * Je besser ein Developer, desto weniger Fehler gibt es.
 *
 * @author Truemmelbach
 */
public class GamePiece {

    private static final int SIZE = 25;
	
	private boolean[] bytes = new boolean[SIZE];
	
	private GamePieceCategory category;

    /**
     * @param category
     * @param skill gibt an, pro wie vielen bytes statisch betrachtet mit einem Fehler zu rechnen ist
     */
	public GamePiece(GamePieceCategory category, int skill) {
        for (int i = 0; i < bytes.length; i++) {
            if (Randomizer.getRandomInt(skill) == 0) {
                bytes[i] = false;
            } else {
                bytes[i] = true;
            }
        }
	}

	public int getBugCount() {
	    int bugs = 0;
	    for (int i = 0; i < bytes.length; i++) {
	        if (bytes[i]) {
	            continue;
            } else {
	            bugs++;
            }
        }
        return bugs;
    }

    public int getQualityPercentage() {
	    int bugs = getBugCount();
	    int correct = SIZE - bugs;
	    return 100 / SIZE * correct;
    }

}
