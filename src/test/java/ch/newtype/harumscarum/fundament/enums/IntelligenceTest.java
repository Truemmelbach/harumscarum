package ch.newtype.harumscarum.fundament.enums;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * @author Truemmelbach
 */
public class IntelligenceTest {
	
	/**
	 * Stellt sicher, dass jede Intelligenzstufe zurückgegeben werden kann.
	 */
	@Test
	public void testGetRandomIntelligence() {
		Set<Intelligence> intelligenceSet = new HashSet<>();
		for (int i = 0; i < 1000; i++) {
			intelligenceSet.add(Intelligence.getRandomIntelligence());
		}
		assertTrue(intelligenceSet.size() == Intelligence.values().length);
	}

}
