class Car{
    String brand;
    String model;
    float price;


    Car(String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+model);
        System.out.println("price: "+price);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car("Audo", "Q7",17555);
        c.display();
    }
}
