
abstract class Vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Vehicle Uses Fuel");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike Starts");
    }
}
public class AbstractionIn {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.fuel();
    }
}
