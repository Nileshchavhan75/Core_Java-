class Laptop{
    String brand;
    String model;
    float price;

    Laptop (String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    Laptop(Laptop s){
        brand = s.brand;
        model = s.model;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("price: "+price);
    }
}
public class Opps4 {
    public static void main(String[] args) {
        Laptop l = new Laptop("Audi","Q7",1500);
        l.display();

        Laptop l2 = new Laptop(l);
        l2.display();
    }
}
