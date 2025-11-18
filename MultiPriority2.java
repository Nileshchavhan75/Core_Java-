public class MultiPriority2 extends Thread{
    String name;
    MultiPriority2(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() +"with priority: "+ currentThread().getPriority());
    }

public static void main(String[] args) {
    MultiPriority2 m1 = new MultiPriority2("Nilesh: ");
    MultiPriority2 m2 = new MultiPriority2("Aryan: ");
    MultiPriority2 m3 = new MultiPriority2("Shivay: ");
    MultiPriority2 m4 = new MultiPriority2("Ganesh: ");
    MultiPriority2 m5 = new MultiPriority2("Krishika: ");

    m1.setPriority(10);
    m2.setPriority(9);
    m3.setPriority(10);
    m4.setPriority(5);
    m5.setPriority(1);

    m1.start();
    m2.start();
    m3.start();
    m4.start();
    m5.start();

    System.out.println("Number of active threads: " + Thread.activeCount());
    System.out.println("one more: "+Thread.currentThread().getName());
    


}
}
