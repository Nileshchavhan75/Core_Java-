class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set thread name
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " with priority " + Thread.currentThread().getPriority() +
                " is running.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Creating threads
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
