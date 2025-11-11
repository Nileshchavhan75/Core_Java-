import java.util.Scanner;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Outer try Block: ");
            try{
                System.out.println("Enter number 1: ");
                int num = sc.nextInt();
                System.out.println("Entred second number: ");
                int num2 = sc.nextInt();

                int result = num/ num2;
            }catch(ArithmeticException e){
                System.out.println("Can not divide with zero: "+ e);
            }
            String str = null;
            System.out.println("String lenght: "+ str.length());
        }catch(NullPointerException e){
            System.out.println("Exception ocuued: "+e);
        }finally{
            System.out.println("Program run Successfully");
        }
        sc.close();
    }
}
