class ThreadGroupEx extends Thread{
    ThreadGroupEx(String name, ThreadGroup grp){
        super(grp,name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Thread is running");
        try{
            sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadGroupDemo4 {
    public static void main(String[] args) {
        ThreadGroup grpp = new ThreadGroup("Parent thread");

        ThreadGroupEx t1 = new ThreadGroupEx("Nilesh", grpp);
        ThreadGroupEx t2 = new ThreadGroupEx("Rutuja",grpp);
        t1.start();
        t2.start();

        System.out.println("Total Thread: "+grpp.activeCount());
        System.out.println("Parent thread name: "+grpp.getName());
    }
}
