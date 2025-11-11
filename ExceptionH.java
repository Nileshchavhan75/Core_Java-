import java.util.*;
public class ExceptionH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try{
            int result = num1 /num2;
            System.out.print("the value after division: "+ result);
        }catch(Exception e){
            System.out.println("Exception Occur: " + e);
        }
       System.out.print("After occuring error still program suns");
    }
}
