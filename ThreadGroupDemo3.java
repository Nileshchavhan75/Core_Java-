class ThreadGroupEx implements Runnable{
    
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" :Thread is running");
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadGroupDemo3 {
    public static void main(String[] args) {
        ThreadGroup grpp = new ThreadGroup("Parent thread");
        ThreadGroupEx r = new ThreadGroupEx();
        ThreadGroupEx r2 = new ThreadGroupEx();

        Thread t1 = new Thread(grpp,r,"Nilesh");

        Thread t2 = new Thread(grpp,r2,"Rutuja");

        t1.start();
        t2.start();

        System.out.println("Total Number Of thread: "+ grpp.activeCount());
        System.out.println("Name of Thread Group: "+ grpp.getName());
        
    }
}
