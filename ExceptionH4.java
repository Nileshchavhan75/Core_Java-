import java.util.Scanner;

public class ExceptionH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2 ");
            int num2 = sc.nextInt();
            try{
                int result = num1/num2;
                System.out.println("the division of two numbwe: "+result);
            }catch(ArithmeticException e){
                System.out.println("exception occured in second try");
            }
            }catch(Exception e){
                System.out.println("Invalid input only entered integer value: " +e);
            }
        }
    }

