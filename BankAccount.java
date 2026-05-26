public class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setBalanace(double balance){
        this.balance = balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountHolder("Nilesh Chavhan");
        b.setBalanace(45000);

        System.out.println(b.getAccountHolder());
        System.out.println(b.getBalance());
        
    }
}
