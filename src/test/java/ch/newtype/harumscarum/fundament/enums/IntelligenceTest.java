package ch.newtype.harumscarum.fundament.enums;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class IntelligenceTest {
	
	/**
	 * Stellt sicher, dass jede Intelligenzstufe zurückgegeben werden kann.
	 */
	@Test
	public void testGetRandomIntelligence() {
		Map<Intelligence, Integer> intelligenceMap = new HashMap<>();
		for (int i = 0; i < 1000; i++) {
			Intelligence currentIntelligence = Intelligence.getRandomIntelligence();
			Integer value = intelligenceMap.get(currentIntelligence);
			if (value == null) {
				value = 0;
			}
			value++;
			intelligenceMap.put(currentIntelligence, value);
		}
		assertTrue(intelligenceMap.size() == Intelligence.values().length);
	}

}
