abstract class Animal {

    String name;

    Animal(String name) {

        this.name = name;

        System.out.println("Animal Constructor Called");
    }

    abstract void sound();

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {

    Dog(String name) {

        super(name);
    }

    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Main1 {

    public static void main(String[] args) {

        Dog d = new Dog("Tommy");

        d.display();
        d.sound();
    }
}