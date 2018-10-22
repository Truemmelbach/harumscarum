package ch.newtype.harumscarum.studio;

import java.util.Random;

import org.junit.jupiter.api.Test;

import ch.newtype.harumscarum.fundament.enums.GamePieceCategory;

public class DeveloperTest {
	
	@Test
	public void testDevelopGamePiece() {
		Developer jason = new Developer();
		for (GamePieceCategory currentGamePieceCategory : GamePieceCategory.values()) {
			System.out.println("skill for " + currentGamePieceCategory + " is " + jason.getGamePieceCategorySkill(currentGamePieceCategory));
		}
	}

}
