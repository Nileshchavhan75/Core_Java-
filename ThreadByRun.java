class Mythread implements Runnable{
    int n;
    Mythread(int n){
        this.n = n;
    }
    public void run(){
        try{
        for(int i = 1; i<=n; i++){
            System.out.println(Thread.currentThread().getName() + " "+ i);
            Thread.sleep(1000);
        }
    }catch(InterruptedException e){
        System.out.println(e);

    }
}
}
public class ThreadByRun {
    public static void main(String[] args) {
        Mythread m = new Mythread(10);
        Mythread m2 = new Mythread(5);
        Thread t = new Thread(m);
        Thread t2 = new Thread(m2);
        t2.setName("Rutuja");
        t.setName("Nilesh: ");
        t.start();
        t2.start();
    }
}
