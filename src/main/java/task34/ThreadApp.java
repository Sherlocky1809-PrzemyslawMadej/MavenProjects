package task34;

public class ThreadApp {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        MyThread thread1 = new MyThread();
        Thread thread2 = new MyThread();

        thread1.start();
        thread2.start();

    }
}
