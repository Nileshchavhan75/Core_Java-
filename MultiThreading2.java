
public class MultiThreading2 extends Thread{
    public static void main(String[] args) {
        try{
            for(int i = 1; i <=10; i++){
                System.out.println(Thread.currentThread().getName() + " Square of number: "+ i +": "+ (i * i));
                sleep(300);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}