package ch.newtype.harumscarum.fundament.enums;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GenderTest {

	@Test
	public void testGetRandomGender() {
		int maleCount = 0;
		int femaleCount = 0;
		for (int i = 0; i < 1000; i++) {
			if (Gender.getRandomGender() == Gender.MALE) {
				maleCount++;
			} else {
				femaleCount++;
			}
		}
		double ratio = maleCount / femaleCount;
		assertTrue(ratio > 0.7 && ratio < 1.5);
	}
}
