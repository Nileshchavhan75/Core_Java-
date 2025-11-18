 class MultiTHreading77 implements Runnable {
    public void run(){
        try{
        int num = 2;
        for(int i = 1; i <=10; i++){
            System.out.println(Thread.currentThread().getName() +" Table of 2: "+ num * i);
            Thread.sleep(300);
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }
    }
}
class MultiTHreading78 implements Runnable {
    public void run(){
        int num1 = 3;
        try{
        for(int i = 1; i <=10; i++){
            System.out.println(Thread.currentThread().getName() +" Table of 3: "+ num1 * i);
            Thread.sleep(300);
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }
}
}
public class MultiTHreading7{
    public static void main(String[] args) {
        MultiTHreading77 m1 = new MultiTHreading77();
        MultiTHreading78 m2 = new MultiTHreading78();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.setName("Multiplecation ");
        t2.setName("Multiplication ");
        t1.start();
        t2.start();

    }
}

