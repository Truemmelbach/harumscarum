package ch.newtype.harumscarum.studio;

import java.util.Random;

import ch.newtype.harumscarum.fundament.enums.GamePieceCategory;
import org.junit.Test;

/**
 * @author Truemmelbach
 */
public class DeveloperTest {
	
	@Test
	public void testDevelopGamePiece() {
		Developer jason = new Developer();
		for (GamePieceCategory currentGamePieceCategory : GamePieceCategory.values()) {
			System.out.println("skill for " + currentGamePieceCategory + " is " + jason.getGamePieceCategorySkill(currentGamePieceCategory));
		}
	}

}
