class ThreadGroupDemo extends Thread {
    ThreadGroupDemo(String name, ThreadGroup grp){
        super(grp, name);
        start();
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " Thread group is ruuning: ");
    }
}
class ThreadGroupDemo1{
    public static void main(String[] args) {
        ThreadGroup grpp = new ThreadGroup("parent Thread");
        ThreadGroupDemo m1 = new ThreadGroupDemo("NIlesh", grpp);
        ThreadGroupDemo m2 = new ThreadGroupDemo("Chavhan", grpp);

        System.out.println("Number of thread running in thread grop: "+ grpp.activeCount());
    }
}
