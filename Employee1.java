public class Employee1 {
    String name;
    double salary;

    Employee1(String n,double s){
        name = n;
        salary = s;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        Employee1 e = new Employee1("Nilesh", 45000);
        Employee1 e2 = new Employee1("Sakshi", 60000);

        e.display();
        System.out.println("---------------------------------------");
        e2.display();
    }
}
