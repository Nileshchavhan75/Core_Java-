import java.util.Scanner;

public class ExceptionH14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num1 = sc.nextInt();
        try{
            if(num1<1){
                throw new RuntimeException("Negative number is not allowed");
            }else{
                System.out.println("valid Number");
            }
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    
    
}
