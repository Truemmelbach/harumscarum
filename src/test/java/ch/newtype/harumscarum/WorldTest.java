package ch.newtype.harumscarum;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorldTest {

    @Test
    public void start() {
        World world = new World();
        world.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        world.pause();
    }
}