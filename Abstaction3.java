abstract class Appliance{
    String brand;
    Appliance(String brand){
        this.brand = brand;
    }
    abstract void turnOn();

    public void showBrand(){
        System.out.println("This is a "+ brand+" appliance.");
    }
}
class Fan extends Appliance{
   public Fan(String brand){
    super(brand);
    }
    void turnOn(){
        System.out.println("Fan is now spinning.");
    }
}
class Light extends Appliance{
    public Light(String brand){
        super(brand);
    }
    void turnOn(){
        System.out.println("Light is now glowing.");
    }
}
public class Abstaction3 {
    public static void main(String[] args) {
        Fan f = new Fan("Samsung");
        f.turnOn();
        f.showBrand();
        Light l = new Light("TATA");
        l.turnOn();
        l.showBrand();
    }
}
