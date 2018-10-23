package ch.newtype.harumscarum;

/**
 * @author Truemmelbach
 */
public class App {

    public static void main( String[] args ) {
        World world = new World();
        world.start();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        world.pause();
    }

}
