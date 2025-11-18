class MyRunnable implements Runnable{
    public void run(){
        int j = 5;
        for(int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + "Table of 5:   "+ j * i);
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int a = 10;
        for(int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() +" Table of 10:   " + a * i);
        }
    }
}
public class MultiThreading8 {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        MyRunnable2 m2 = new MyRunnable2();
        Thread T1 = new Thread(m1, "Multiplication ");
        Thread T2 = new Thread(m2, "Maltipliacation ");
        T1.start();
        T2.start();

    }
}
