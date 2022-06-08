package task35;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Actual working thread: " + Thread.currentThread().getName());
    }
}
