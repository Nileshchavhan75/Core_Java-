class Human{
    String name;
    int age;
}
class Student extends Human{
    int roll_num;
    public void display(){
        System.out.println(name+" "+age+" "+roll_num);
    }
}
class Employee extends Human{
    int salary;
    public void display(){
        System.out.println(name+" "+age+" "+salary);
    }
}


public class InheritanceExa3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nilesh";
        s1.age = 22;
        s1.roll_num = 12;
        s1.display();

        Employee e = new Employee();
        e.name = "Rutuja";
        e.age = 21;
        e.salary = 25000;
        e.display();
    }
}
