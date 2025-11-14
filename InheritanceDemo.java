// Superclass
class Vehicle {
    // Fields (attributes)
    String brand = "Toyota";
    
    // Method
    public void honk() {
        System.out.println("Beep beep!");
    }
}

// Subclass (inherits from Vehicle)
class Car extends Vehicle {
    // Additional field
    String model = "Corolla";

    // Additional method
    public void displayDetails() {
        System.out.println("Brand: " + brand); // Inherited field
        System.out.println("Model: " + model); // Own field
    }
}

// Public class to match the filename
public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Car myCar = new Car();
        
        // Calling methods from the superclass and subclass
        myCar.honk(); // Inherited method
        myCar.displayDetails(); // Subclass method
    }
}
