class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running: ");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running: ");
    }
}

public class MultiThreadin {
    public static void main(String[] args) {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        T1.start();
        T2.start();

        
    }
}
