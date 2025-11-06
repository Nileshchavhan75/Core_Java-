abstract class Animal{
    abstract void sound();
    public void eat(){
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog Bark ");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meow");
    }
}
public class Abstaction2 {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.sound();
        d.eat();
        Cat c = new Cat();
        c.sound();
        c.eat();
    }
}
