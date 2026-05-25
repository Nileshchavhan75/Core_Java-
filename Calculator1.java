public class Calculator1 {
    void greet(){
        System.out.println("Welcome");
    }
    int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.greet();

        int result = c.square(5);
        System.out.println("Square of Number : "+result);
    }
}
