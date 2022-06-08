package task39;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Sensor implements Runnable {

    private final AtomicInteger score;
    private final Random random;

    public Sensor(AtomicInteger score) {
        this.score = score;
        random = new Random();
    }

    @Override
    public void run() {
        try {
            int lastKnownValue = score.get();

            while (true) {
                int newValue = lastKnownValue + 1;
                if (score.compareAndSet(lastKnownValue, newValue)) {
                    System.out.println("Score updated to: " + newValue);
                } else {
                    System.out.println("Score was outdated - the result was just updated.");
                }
                lastKnownValue = score.get();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
