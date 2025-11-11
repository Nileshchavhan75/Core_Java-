import java.util.Scanner;

public class EXceptionHp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("Enter number for division: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try{
            int result = num1/num2;
            System.out.println("the division of number: " +result);
        }catch(ArithmeticException e){
            System.out.println(e + "occured");
        }
        }catch(java.util.InputMismatchException e ){
            System.out.println("Please valid input: "+e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
