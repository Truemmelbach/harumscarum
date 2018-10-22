package ch.newtype.harumscarum.fundament.enums;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

public class GenreTest {
	
	@Test
	public void testGetRandomGenres() {
		Set<Genre> randomGenres = Genre.getRandomGenres();
		assertTrue(randomGenres != null && randomGenres.size() > 0);
	}
	
	@Test
	public void testGetRandomGenresExcluding() {
		Set<Genre> favorites = Genre.getRandomGenres();
		assertTrue(favorites != null && favorites.size() > 0);
		int sizeBefore = favorites.size();
		Set<Genre> leastFavorites = Genre.getRandomGenresExcluding(favorites);
		assertTrue(leastFavorites != null && leastFavorites.size() > 0);
		assertTrue(sizeBefore == favorites.size());
		for (Genre currentGenre : favorites) {
			assertTrue(!leastFavorites.contains(currentGenre));
		}
	}

}
