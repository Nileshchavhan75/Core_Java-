class JoinEx1 extends Thread{
    public void run(){
        int sum = 0;
        for(int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + "Whole num: "+ (sum += i));
        }
    }
}
class JoinEx2 extends Thread{
    public void run(){
        int fact = 1;
        for(int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + " of: "+ (fact *= i));
        }
    }
}
class JoinEx3 extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + "Number : "+ i * i);
        }
    }
}
public class MultiThreading9 {
    public static void main(String[] args) {
        JoinEx1 j1 = new JoinEx1();
        JoinEx2 j2 = new JoinEx2();
        JoinEx3 j3 = new JoinEx3();
        j1.setName("Sum of ");
        j2.setName("factorial ");
        j3.setName("square of whole ");

        j1.start();
        try{
            j1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        j2.start();
        try{
            j2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        j3.start();
    } 
}

