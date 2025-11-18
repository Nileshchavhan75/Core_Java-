class Vahicle{
    public void start(){
        System.out.println("Vahicle started");
    }
}
class Car extends Vahicle{
    public void start(){
        System.out.println("Car get started: ");
    }
}
class Bike extends Vahicle{
    public void start(){
        System.out.println("Bike get started: ");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vahicle Mycar = new Car();
        Vahicle MyBike = new Bike();
        Mycar.start();
        MyBike.start();
    }
}
