import java.util.*;
public class ExceptionH16 {
    public static void chackAge(int a) throws RuntimeException{
        if(a<18){
            throw new RuntimeException("your not eligible of vote");
        }else{
            System.out.println("eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try{
            chackAge(age);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
