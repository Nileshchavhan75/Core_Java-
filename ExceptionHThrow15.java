//import java.util.Scanner;;
public class ExceptionHThrow15 {

    public static void calculateDivision(int a, int b) throws ArithmeticException{
        int result = a/b;
        System.out.println("Result: "+ result);
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try{
            calculateDivision(num1, num2);
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
}
