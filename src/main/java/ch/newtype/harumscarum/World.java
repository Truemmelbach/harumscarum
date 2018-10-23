package ch.newtype.harumscarum;

/**
 *
 * @author Truemmelbach
 */
public class World {

    private static long WAITING_TIME = 10000;

    private static boolean RUNNING = false;

    public World() {
    }

    public void pause() {
        RUNNING = false;
    }

    public void start() {
        startTimer();
    }

    private void startTimer() {
        RUNNING = true;
        new Thread() {
            @Override
            public void run() {
                while (RUNNING) {
                    tick();
                    try {
                        Thread.sleep(WAITING_TIME);
                    } catch (InterruptedException e) {

                    }
                }
            }
        }.start();
    }

    private void tick() {
        System.out.println("tick");
    }

}
