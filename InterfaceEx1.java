interface shape{
    void area();
}
class Circle implements shape{
    int redius;
    Circle(int r){
        redius = r;
    }
    public void area(){
    System.out.println(redius * redius *3.14 );
    }
}
class Rectangle implements shape{
    int l;
    int b;
    Rectangle(int l , int b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println(l * b);
    }
}
public class InterfaceEx1{
    public static void main(String[] args) {
        shape c = new Circle(5);
        shape r = new Rectangle(10,5);
        c.area();
        r.area();
    }
}
