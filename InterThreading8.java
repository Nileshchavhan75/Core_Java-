class Customer{
    int amount = 10000;
    public synchronized void withDraw(int amount){
        System.out.println("Going to Withdraw: ");
        if(this.amount<amount){
            System.out.println("Waiting for deposit");
            try{
                wait();

            }catch(InterruptedException e){
                System.out.println(e);
            }
            this.amount -= amount;
            System.out.println("Amount withdraw succesfully , current balance: "+this.amount);
        }
    }

    public synchronized void deposit(int amount){
        System.out.println("Going to deposit money");
        this.amount += amount;
        System.out.println("Amount deposit successfully, current balance: "+ this.amount);
        notify();
    }
}
public class InterThreading8 extends Thread{
    Customer c;
    int amount;
    boolean isDeposit;

    InterThreading8(Customer c, int amount, boolean isDeposit){
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

        InterThreading8 t1 = new InterThreading8(c, 15000, false);
        InterThreading8 t2 = new InterThreading8(c, 10000, true);
        t1.start();
        t2.start();
        
    }
}
