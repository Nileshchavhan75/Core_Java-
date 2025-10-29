class Mythread extends Thread{
    
    Mythread(String name){
        super(name);
    }

    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+ i);
        }
    }

    public static void main(String[] args) {
        Mythread t = new Mythread("Nilesh: ");
        Mythread t2 = new Mythread("Rutuja: ");
        Mythread t3 = new Mythread("Shivay: ");

        t.start();
        try{
            t.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        try{
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t3.start();
        try{
            t3.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
