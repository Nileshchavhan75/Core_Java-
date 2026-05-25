public class Mobile {
    String brand;
    double price;

    Mobile(){
        System.out.println("Mobile Object Created");
    }
    Mobile(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {
        Mobile m = new Mobile();

        Mobile m1 = new Mobile("BMW",4500000);
        m1.display();
    }
}
