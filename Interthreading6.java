class Customer{
    int amount = 10000;
    public synchronized void withDraw(int withdrawAmount){
            System.out.println("Going to Withdraw amount: ");
        if(this.amount < withdrawAmount){
            System.out.println("less balance, waiting for deposit: ");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        this.amount -= withdrawAmount;
        System.out.println("Withdraw amount, current balance: "+ this.amount);
        }
    }

    public synchronized void deposit(int depositAmount){
        System.out.println("going to deposit");
        this.amount += depositAmount;
        System.out.println("deposit complete, current amount: "+this.amount);
        notify();
    }
}
public class Interthreading6 extends Thread{
    Customer c;
    int amount;
    boolean isDeposit;
    Interthreading6(Customer c, int amount, boolean isDeposit){
        this.c = c;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }
    public void run(){
        if(isDeposit){
            c.deposit(amount);
        }else{
            c.withDraw(amount);
        }
    }
    public static void main(String[] args) {
        final Customer c = new Customer();

        Thread t1 = new Interthreading6(c, 15000, false);
        Thread t2 = new Interthreading6(c, 10000, true);
        t1.start();
        t2.start();
    }
}
