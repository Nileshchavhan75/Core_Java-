import java.util.Scanner;

public class ExceptionEx5 {
    public static void checkValidAge(int age){
        if(age<18){
            throw new RuntimeException("You must be at least 18 years old");
        }else{
            System.out.println("You are Eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try{
            checkValidAge(age);
        }catch(RuntimeException e){
            System.out.println("Exception occred: "+e.getMessage());
        }
        sc.close();
        
    }
}
