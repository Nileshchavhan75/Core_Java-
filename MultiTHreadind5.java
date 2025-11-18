class MyRunable1 implements Runnable{
    public void run(){
        System.out.println("Running thread by using Runnable interface1: ");
        System.out.println("Running thread by using Runnable interface1: ");
        System.out.println("Running thread by using Runnable interface1: ");
        System.out.println("Running thread by using Runnable interface1: ");
        System.out.println("Running thread by using Runnable interface1: ");
        System.out.println("Running thread by using Runnable interface1: ");

    }
}
class MyRunable2 implements Runnable
{
    public void run(){
     System.out.println("Running thread by using Runnable interface2: ");
     System.out.println("Running thread by using Runnable interface2: ");
     System.out.println("Running thread by using Runnable interface2: ");
     System.out.println("Running thread by using Runnable interface2: ");
     System.out.println("Running thread by using Runnable interface2: ");
    }
}
public class MultiTHreadind5 {
    public static void main(String[] args) {
        MyRunable1 t1 = new MyRunable1();
        MyRunable2 t2 = new MyRunable2();
        Thread m1 = new Thread(t1);
        Thread m2 = new Thread(t2);
        m1.start();
        m2.start();
    }
}

