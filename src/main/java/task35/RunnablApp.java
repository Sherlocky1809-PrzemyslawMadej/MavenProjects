package task35;

public class RunnablApp {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        Thread thread3 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread3.start();
        thread3.join();
    }
}
