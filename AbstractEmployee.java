abstract class Employee{
    String name;
    int empId;
    double baseSalary;

    Employee(String name, int empId, double baseSalary){
        this.name = name;
        this.empId = empId;
        this.baseSalary = baseSalary;
    }

    abstract double calculateBonus();

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("EmpId: "+empId);
        System.out.println("Base Salary: "+baseSalary);
    }
    
}
class Developer extends Employee{
    int projectCount;

    Developer(String name, int empId, double baseSalary, int projectCount){
        super(name, empId, baseSalary);
        this.projectCount = projectCount;
    }

    double calculateBonus(){
        return 1000*projectCount;
    }
    public void showBonus(){
        System.out.println("Bonus: "+calculateBonus());
    }
}
class Manager extends Employee{
    int teamsize;
    Manager(String name, int empId, double baseSalary,int teamsize){
        super(name, empId, baseSalary);
        this.teamsize = teamsize;
    }
    double calculateBonus(){
        return 5000 * teamsize;
    }
    public void showBonus2(){
        System.out.println("Bonus: "+calculateBonus());
    }
    
}
public class AbstractEmployee {
    public static void main(String[] args) {
        Developer d = new Developer("Nilesh", 12, 50000, 5);
        d.showDetails();
        d.showBonus();
        System.out.println();
        System.out.println("-------------------------------------------");
        Manager m = new Manager("Rutuja", 14, 70000, 5);
        m.showDetails();
        m.showBonus2();
    }
}
