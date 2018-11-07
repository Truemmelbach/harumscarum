package ch.newtype.harumscarum;

/**
 *
 * @author Truemmelbach
 */
public class World {

    private static long DEFAULT_WAITING_TIME = 10000;

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
                    long waitingTime = DEFAULT_WAITING_TIME - tick();
                    if (waitingTime < 0) {
                        waitingTime = 0;
                    }
                    try {
                        System.out.println("I'm going to wait " + waitingTime + " millis");
                        Thread.sleep(waitingTime);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();
    }

    private long tick() {
        long start = System.currentTimeMillis();
        System.out.println("tick start: " + start);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - start;
    }

}
