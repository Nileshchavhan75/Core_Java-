public class Employee {
   String name;
   int id;
   float salary;

   Employee(String name) {
      this.name = name;
      this.id = 0;
      this.salary = 0.0f; 
   }

   Employee(String name, int id, float salary) {
      this.name = name;
      this.id = id;
      this.salary = salary;
   }

   void display() {
      System.out.println("Employee Name: " + name);
      System.out.println("Employee ID: " + id);
      System.out.println("Employee Salary: " + salary);
   }

   public static void main(String args[]) {
      Employee e1 = new Employee("Shivay",07,16655.2f);
      Employee e2 = new Employee("Aryan", 77, 1555.7f);

      e1.display();
      e2.display();
   }
}
