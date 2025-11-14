class Interthreading extends Thread {
    int total = 0;
    public void run(){
        synchronized(this){
            for(int i = 1; i<=10; i++){
                total = total + 100;
            }
            this.notify();
        }
    }
}
public class InterthreadingExe{
    public static void main(String[] args) {
        Interthreading e = new Interthreading();
        e.start();
        synchronized(e){
            try{
            e.wait();
            }catch(InterruptedException ex){
                System.out.println(ex);
            }
            System.out.println("Total: "+ e.total);
        }
    }
}