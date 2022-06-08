package task39;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Screen implements Runnable {

    private final AtomicInteger score;

    public Screen(AtomicInteger score) {
        this.score = score;
    }

    @Override
    public void run() {

        try {
            while (true) {
                Thread.sleep(new Random().nextInt(1000));
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }
}
