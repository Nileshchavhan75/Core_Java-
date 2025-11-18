
public class MultiThreading6 extends Thread {
    public void run(){
        for(int i = 1; i <=10; i++){
            System.out.println(Thread.currentThread().getName() + "Natural Number: "+i);
        }
    }
    public static void main(String[] args) {
        MultiThreading6 m1 = new MultiThreading6();
        m1.setName("First THread: ");
        m1.start();
        try{
            for(int i = 1; i <= 20; i++){
                if(i % 2 == 0){
                    System.out.println(Thread.currentThread().getName() + "Even Number" + i);
                    sleep(300);
                }
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
