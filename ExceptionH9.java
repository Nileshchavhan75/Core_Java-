import java.util.Scanner;
public class ExceptionH9 {
    public static void checkValidAge(int age){
        if(age < 18){
            throw new RuntimeException("Age is too low. Access Denied.");
        }else{
            System.out.println("Accesed granted");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try{
            checkValidAge(age);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
