public class MultiPriority3 extends Thread {
    MultiPriority3(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Thread with priority: "+ currentThread().getPriority());
    }
    public static void main(String[] args) {
        MultiPriority3 m = new MultiPriority3("Nilesh");
        MultiPriority3 m1 = new MultiPriority3("Shivay");
       
        m.setPriority(8);
        m1.setPriority(5);
        m.start();
        m1.start();
    }
}

