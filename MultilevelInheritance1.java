class Person{
    String  name;
    Person(String name){
        this.name = name;
    }
    void showName(){
        System.out.println("Person Name: "+name);
    }
}
class Employee extends Person{
    double salary;
    Employee(String name,double salary){
        super(name);
        this.salary = salary;
    }
    void showSalary(){
        System.out.println("Salary: "+salary);
    }
}
public class MultilevelInheritance1 {
    public static void main(String[] args) {
        Employee e = new Employee("Nilesh", 45000.0);
        Employee e2 = new Employee("Sakshi", 22000);

        e.showName();
        e.showSalary();

        System.out.println("-------------------------");
        e2.showName();
        e2.showSalary();
    }
}