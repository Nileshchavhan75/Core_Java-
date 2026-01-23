abstract class Shape{
    abstract void area();
    void displayType(){
        System.out.println("This is shape: ");
    }
}
class Rect extends Shape{
    void area(){
        System.out.println("Rectangle: ");
    }
}
public class Abstaction {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.area();
        r.displayType();
    }
}
