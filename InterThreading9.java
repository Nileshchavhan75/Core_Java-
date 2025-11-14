class Customer{
    int Balance = 10000;
    public void withDrawAmount(int amount){
        synchronized(this){
        System.out.println("Going to withdraw amount");
        while(Balance<amount){
            System.out.println("Waiting to deposit");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
            Balance -= amount;
            System.out.println("Withdraw successfully, current Balance: "+Balance);
        }
    }
    }

    public void deposit(int deposit){
        synchronized(this){
        System.out.println("Going to deposit amount");
        Balance += deposit;
        System.out.println("Deposit succssfully, current Balance: "+ Balance);
        notify();
    }
}
}
public class InterThreading9 extends Thread {
    Customer c;
    int amount;
    boolean isDeposit;
    InterThreading9(Customer c, int amount, boolean isDeposit){
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
        InterThreading9 t1 = new InterThreading9(c, 15000, false);
        InterThreading9 t2 = new InterThreading9(c, 10000, true);
        t1.start();
        t2.start();
    }
}
