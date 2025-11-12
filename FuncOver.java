import java.util.Scanner;
class Human{
    String name;
    int age;
    
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name,int age){
        System.out.println(name +" " +age);
    }

}
public class FuncOver {
    public static void main(String args[]){
        Human h1 = new Human();
        h1.displayInfo("RUtuja");
        h1.displayInfo(21);
        h1.displayInfo("Nilesh",22);
    }
    
}
