class IsAliveEx implements Runnable{
    public void run(){
        try{
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + i);
            Thread.sleep(300);
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }
 
  }
}
class IsAliveEx2 implements Runnable{
    public void run(){
        try{
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + i * i);
            Thread.sleep(300);
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }
 
  }
}

public class MultiThreading11 {
    public static void main(String[] args) {
        IsAliveEx e1 = new IsAliveEx();
        IsAliveEx2 e2 = new IsAliveEx2();
        Thread t1 = new Thread(e1,"Number: ");
        Thread t2 = new Thread(e2,"Square: ");
        System.out.println("Chack First thread is: "+ t1.isAlive());
        System.out.println("check second thread is "+t2.isAlive());
        t1.start();
        System.out.println("Chack First thread is: "+ t1.isAlive());
        try{
            t1.join();
        System.out.println("Chack Fiesrt during execution thread is: "+ t1.isAlive());
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("check second thread is "+t2.isAlive());
        t2.start();
        System.out.println("check second thread is "+t2.isAlive());

    }
}
