class Employee{
    public void getSalary(int salary){
        System.out.println("Salary: "+ salary);
    }
}
class Manager extends Employee{
    public void getSalary(int salary){
        System.out.println("Manger salary: "+salary);
    }
}
class Developer extends Employee{
    public void getSalary(int salary){
        System.out.println("Developer salary: "+ salary);

    }
}
public class MethodOverriding2 {
    public static void main(String[] args) {
        Employee myManager = new Manager();
        Employee myDeveloper = new Developer();
        myManager.getSalary(50000);
        myDeveloper.getSalary(60000);
    }
}
