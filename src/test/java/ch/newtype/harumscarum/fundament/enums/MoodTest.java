package ch.newtype.harumscarum.fundament.enums;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Truemmelbach
 */
public class MoodTest {

    @Test
    public void testIncrease() {
        Mood mood = Mood.NEUTRAL;
        mood = mood.increase();
        assertEquals(mood, Mood.ALLRIGHT);
        mood = mood.increase();
        assertEquals(mood, Mood.WELL);
        mood = mood.increase();
        assertEquals(mood, Mood.UPBEAT);
        mood = mood.increase();
        assertEquals(mood, Mood.ENERGETIC);
        mood = mood.increase();
        assertEquals(mood, Mood.HAPPY);
        mood = mood.increase();
        assertEquals(mood, Mood.HAPPY);
        mood = mood.increase();
        assertEquals(mood, Mood.HAPPY);
    }

    @Test
    public void testDecrease() {
        Mood mood = Mood.NEUTRAL;
        mood = mood.decrease();
        assertEquals(mood, Mood.BORED);
        mood = mood.decrease();
        assertEquals(mood, Mood.DOGGISH);
        mood = mood.decrease();
        assertEquals(mood, Mood.PISSED);
        mood = mood.decrease();
        assertEquals(mood, Mood.ANGRY);
        mood = mood.decrease();
        assertEquals(mood, Mood.HOPELESS);
        mood = mood.decrease();
        assertEquals(mood, Mood.HOPELESS);
        mood = mood.decrease();
        assertEquals(mood, Mood.HOPELESS);
    }
}