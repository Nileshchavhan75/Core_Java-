import java.util.*;
public class ExceptionEx {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter Number one: ");
        int num = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();  
            int result = num/num2;
            System.out.println("Result: "+ result);
        }catch(ArithmeticException e){
            System.out.println("Excetion occured: "+ e);
        }catch(InputMismatchException e){
            System.out.println("Please Enter only Integer Number: ");
        }
        sc.close();
    }
}
