public class OuterClass2 {
    String message = "Nilesh & Rutuja";

    class InnerClass{
        public void showMessage(){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        OuterClass2 o = new OuterClass2();
        OuterClass2.InnerClass a = o.new InnerClass();
        a.showMessage();
    }
}
