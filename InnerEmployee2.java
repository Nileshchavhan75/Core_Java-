class Employee2 {
    protected double salary = 50000;
}
class Manager extends Employee2{
    public void showSalary(){
        System.out.println("Salary of Employee: "+super.salary);
    }
}
public class InnerEmployee2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showSalary();
    }
    
}