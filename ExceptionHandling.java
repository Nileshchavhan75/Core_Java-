

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

public class ExceptionHandling {
    double balance;
        ExceptionHandling(int bala){
            this.balance = bala;
        }
     void BalanceException(double amount)throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Please Enter Valid amount");
        }else{
            System.out.print("Amount debited succssfully: ");
             System.out.println(balance-amount);
        }       
    }
    public static void main(String[] args) {
        ExceptionHandling ex = new ExceptionHandling(500000);
        try{
            ex.BalanceException(1000);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
