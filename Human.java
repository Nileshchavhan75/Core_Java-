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
}
public class Student{
    public static void main(String args[]){
        Human h1 = new Human("",21);
    }
}
