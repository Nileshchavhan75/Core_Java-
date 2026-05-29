interface Animal{
    public void sound();
}
interface Pet   {
    public void play();
}
class Dog implements Animal,Pet{
    public void sound(){
        System.out.println("Dog Barks");
    }
    public void play(){
        System.out.println("Dog Plays");
    }
}
public class InterfaceImple {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.play();
    }
}
