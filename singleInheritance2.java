class Person{
    String name;
    int age;

     Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("age: "+age);
    }
}
class Student extends Person{
    int roll_num;
    
    Student(String name, int age, int roll_num){
        super(name,age);
        this.roll_num = roll_num;
    }
    public void StudentDis(){
        display();
        System.out.println("Roll Number: "+ roll_num);
    }
}
public class singleInheritance2 {
    public static void main(String[] args) {
        Student s1 = new Student("Rutuja", 21, 14);
        Student s2 = new Student("Nilesh", 23,12);
        s1.StudentDis();
    }
}
