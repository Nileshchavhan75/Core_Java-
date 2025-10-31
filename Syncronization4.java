class Odd{
    int oddn;
    public void PrintOdd(int oddn){
        synchronized(this){
            System.out.println("Odd number printing: ");
            for(int i =1; i<= oddn; i++ ){
                if(i % 2 != 0){
                    System.out.println(i);
                }

            }        
        }

    }
}
public class Syncronization4 extends Thread{
    Odd d;
    int num;
    Syncronization4(int num, Odd d){
        this.num = num;
        this.d = d;
    }
    public void run(){
        d.PrintOdd(num);
    }

    public static void main(String[] args) {
        Odd d = new Odd();
        Syncronization4 s1 = new Syncronization4(50, d);
        Syncronization4 s2 = new Syncronization4(60, d);
        s1.start();
        s2.start();

    }
}
