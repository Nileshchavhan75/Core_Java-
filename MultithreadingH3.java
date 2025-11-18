public class MultithreadingH3 extends Thread {
    public void run(){
        try{
        for(int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + "count 1: "+ i);
            sleep(300 );
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }
    }

    public static void main(String[] args) {
        MultithreadingH3 t1 = new MultithreadingH3();
        t1.start();
        try{
            for(int i = 1; i<=10; i++){
                System.out.println(Thread.currentThread().getName()+ " "+ i * i);
                sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}