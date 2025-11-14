class Interthreading extends Thread{
    int total;
    public void run(){
        synchronized(this){
            for(int i = 1; i<=10; i++){
                total = total +100;
            }
            this.notify();
        } 
    }
}
public class InterthreadingEx {
    public static void main(String[] args) {
        Interthreading i = new Interthreading();
        i.start();
        
        synchronized(i){
            try{
            i.wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("The total: "+ i.total);
        }
        System.out.println("main thread start his execution from here: ");
        for(int j = 1; j <=5; j++){
            System.out.println(j);
        }

        }
        

    }



