class Vahicle{
    String brand;
    String model;

    public void displayDetails(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
    }
}
class Car extends Vahicle{
    String Fualtype;
    
    public void displayDe(){
        displayDetails();
        System.out.println("Fualtype: "+ Fualtype);
    }
}
public class singleInheritance {
   public static void main(String[] args) {
    Car c = new Car();
    c.brand = "Maruti";
    c.model = "Desire 2009";
    c.Fualtype = "Petrol";
    c.displayDe();
   }

}
