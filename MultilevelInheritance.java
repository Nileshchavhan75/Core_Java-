class Animal{
    String Species = "Wild";

    public void displaySpecies(){
        System.out.println("Species: "+ Species);
    }
}
class Mammal extends Animal{
    String  warm = "Slipari animal";

    public void WarmDisplay(){
        System.out.println("warm: "+ warm);
    }
}
class Dog extends Mammal{
    String dog = "breed";
    public void dogDisplay(){
        System.out.println("Dog: "+ dog);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displaySpecies();
        d.WarmDisplay();
        d.dogDisplay();
    }
}
