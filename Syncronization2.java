class Even{
    synchronized void printEven(int num){
        System.out.println("Thread Executing: ");
        for (int i = 1; i <= num; i++) { 
            if (i % 2 == 0) { 
                System.out.println(i); 
            }
        } 
    }
}
public class Syncronization2 extends Thread {
    Even e;
    int num1;
    Syncronization2(Even e, int num1){
        this.e = e;
        this.num1 = num1;
    }
    public void run(){
        
        e.printEven(num1);
    }
    public static void main(String[] args) {
        Even e = new Even();
        Syncronization2 s1 = new Syncronization2(e, 50);
        Syncronization2 s2 = new Syncronization2(e, 60);

        s1.start();
        s2.start();
    }
}
