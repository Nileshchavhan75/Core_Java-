public class MultiThreading extends Thread {
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+": count"+ i);
        }
    }
    public void printName(){
        System.out.println("Name is Nilesh");
    }
    public static void main(String args[]){
        MultiThreading m1 = new MultiThreading();
        m1.setName("Child thread");
        m1.start();
        MultiThreading m2 = new MultiThreading();
        m2.printName();
    }
}
