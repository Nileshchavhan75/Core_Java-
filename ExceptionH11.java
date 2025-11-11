import java.util.*;
public class ExceptionH11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        try{
            int result = num1/num2;
            System.out.println("result: "+result);
        }catch(Exception e){
            System.out.println("Exception occured: "+e);
        }
        sc.close();
    }
}
