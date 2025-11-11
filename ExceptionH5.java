import java.util.Scanner;

public class ExceptionH5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        try{
            if(num1 < 0){
                throw new ArithmeticException("\"Number is negative: \"");
            }
            System.out.println("number is: "+num1);
        }catch(ArithmeticException e){
            System.out.println("exception occured"+ e.getMessage());
        }
        System.out.println("after running code: ");

    }
}
