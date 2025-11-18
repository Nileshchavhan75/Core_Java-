class Shape{
    public void area(){
        System.out.println("Shape Area");
    }
}
class Circle extends Shape{
   public void area(float radius){
    System.out.println(radius * radius * 3.14);
}
}
class Rectangle extends Shape{
   public void area(int lenght, int breadth){
        System.out.println(lenght*breadth);
    }
}
public class MethodOverriding1 {
    
    public static void main(String[] args) {
    Shape s = new Circle();
    s.area(5.2);
    Shape s2 = new Rectangle();
    
    s2.area(4,5);
    }
    
}
