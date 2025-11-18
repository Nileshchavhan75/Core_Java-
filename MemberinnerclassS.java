class Outer{
    static int number = 10;
    String name = "Nilesh";
    
    void display(){
        System.out.println("outer massage: ");
    }

    static class Inner{
        void displayInner(){
            System.out.println("data of the outer class: "+ number);
            Outer o = new Outer();
            System.out.println("instance variable of outer: "+ o.name);
            o.display();    
        }
    }
}
public class MemberinnerclassS {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.displayInner();
    }
        
}
