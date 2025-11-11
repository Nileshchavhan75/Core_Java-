import java.util.Scanner;

public class ExceptionEx4 {
    public static void checkEx(int num){
        if(num == 0){
            throw new ArithmeticException("Can not divide by zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Entered second number: ");
        int num2 = sc.nextInt();
        try{
            checkEx(num2);
            int result = num/num2;
            System.out.println("Result: "+ result);
        }catch(ArithmeticException e){
            System.out.println("Exception occured: "+e.getMessage());
        }
        sc.close();
    }
}
