 interface Animal {
    void sound();
    
}
class Dog implements Animal{
    public void sound(){
        System.out.println("the dog bark");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("the cat meows");
    }
}
class Cows implements Animal{
    public void sound(){
        System.out.println("the cows moos");
    }
}
public class interfaceEx {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Cows f = new Cows();
        d.sound();
        c.sound();
        f.sound();
    }
}
