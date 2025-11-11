import java.util.Scanner;
public class ExceptionH13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try{
            if(age < 18){
                throw new RuntimeException("Age is not valid for voting");
            }else{
                System.out.println("Eligible to vote");
            }
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
        }
        sc.close();
    }
}
