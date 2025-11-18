class Outer{
    int x = 10;
    String name = "Nilesh";

    class Inner{
        void display(){
            System.out.println("data of the outer class: "+x+"  "+name);
        }
    }

}
public class MemberInner {
    public static void main(String[] args) {
    Outer o = new Outer();
    Outer.Inner in = o.new Inner();
    in.display();
        
    }
    
    
}
