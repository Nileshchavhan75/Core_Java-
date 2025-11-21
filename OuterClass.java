public class OuterClass {
    private int x = 75;

    class InnerClass{
        public void display(){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass a = o.new InnerClass();
        a.display();
    }
}

