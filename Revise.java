public class Revise {
    String brand;
    float price;

    public void display(){
        System.out.println("Car Name: "+brand);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        Revise r = new Revise();
        r.brand = "BMW";
        r.price = 450000;
        r.display();

    }
}
