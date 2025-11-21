class Rectangle{
    int length;
    int  width;

    void Display(){
        System.out.println("Area if the Rectangle: "+ length * width);
    }
}

public class OOPs2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 15;
        r.width = 10;
        r.Display();
    }
}
