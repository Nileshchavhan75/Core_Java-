import java.net.Socket;

class ThreadGroupEx extends Thread{
    ThreadGroupEx(String threadname, ThreadGroup grp){
        super(grp, threadname);
    }

    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" THread is running");
            sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup grpp = new ThreadGroup("Parent Thread");
        ThreadGroupEx t1 = new ThreadGroupEx("Nilesh", grpp);
        ThreadGroupEx t2 = new ThreadGroupEx("Shivay", grpp);
        t1.start();
        t2.start();
        System.out.println("Total Number of thread: "+ grpp.activeCount());
        System.out.println("Get thread group name: "+grpp.getName());
    }
}
