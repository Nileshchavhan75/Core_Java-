class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape s2 = new Circle();
        
        s.draw();
        s2.draw();
    }
}
