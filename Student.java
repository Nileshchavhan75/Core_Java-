import java.util.Scanner;
class Human{
    String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);
        
    }
    Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    Human(Human h3){
        this.name = h3.name;
        this.age = h3.age;
    }
}
public class Student{
    public static void main(String args[]){
        Human h1 = new Human("Rutuja",21);
        Human h2 = new Human(h1);
        h2.display();
    }
}
