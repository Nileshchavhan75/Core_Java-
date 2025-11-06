abstract class Vahicle{
    abstract void start();
}
class Car extends Vahicle{
    void start(){
        System.out.println("Car is starting with a key ignition.");
    }

}
class Bike extends Vahicle{
    void start(){
        System.out.println("Bike is starting with a kick");
    }
}

public class abstac {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.start();
    }
}
