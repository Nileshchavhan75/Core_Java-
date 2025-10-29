class Frist extends Thread{
    int n;
    Frist(int n){
        this.n = n;
    }
    public void run(){
        for(int i = 1; i<= n; i++){
            System.out.println(Thread.currentThread().getName()+" i : "+ i);
        }
    }
}
public class Threade{
    public static void main(String[] args) {
        Frist f = new Frist(5);
        f.setName("Mythread");
        f.start();

        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+ " "+ i);
        }
    }


}