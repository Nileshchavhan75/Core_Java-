class Customer{
    int amount = 10000;
    public synchronized void withDrawAmount(int amount){
        System.out.println("Going to withdraw:");
        if(this.amount<amount){
            System.out.println("Waiting for deposit: ");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
            this.amount -= amount;
            System.out.println("withdraw amount: current Balance: "+ this.amount);
        }
    }
    public synchronized void deposit(int aamount){
        System.out.println("going to deposit: ");
        this.amount += amount;

        System.out.println("deposit seccussfull: current balance: "+ this.amount);
        notify();
    }
}
public class Interthreading7 extends Thread{
    Customer c;
    int amount;
    boolean isDeposit;
    Interthreading7(Customer c, int amount, boolean isDeposit){
        this.c = c;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }
    public void run(){
        if(isDeposit){
            c.deposit(amount);
        }else{
            c.withDrawAmount(amount);
        }
    }


    public static void main(String[] args) {
        final Customer c = new Customer();

        Interthreading7 t1 = new Interthreading7(c, 15000, false);
        Interthreading7 t2 = new Interthreading7(c, 10000, true);

        t1.start();
        t2.start();
    }
}
