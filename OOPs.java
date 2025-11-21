class Person{
    String name;
    int age;

    Person(){
        name = "unknown";
        age = 18;
    }

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class OOPs {
    public static void main(String[] args) {
        Person p = new Person();
        p.Display();
        
    }
}
