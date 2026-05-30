class Bank {
    final double interestRate = 7.5;

    final public void showRules(){
        System.out.println("Final example");
    }
}
class Check extends Bank{
    void info(){
        System.out.println("Bank Manager");
    }
    
}
public class FinalChecking{
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.interestRate);
        b.showRules();

        Check c = new Check();
        c.showRules();
        System.out.println(c.interestRate);
    }
}