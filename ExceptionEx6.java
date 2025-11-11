import java.util.Scanner;

public class ExceptionEx6 {
   public static void numberCheck(int num) throws IllegalArgumentException{
        if(num< 0){
            throw new IllegalArgumentException("Number is negetive please enter valid number: ");
        }else{
            System.out.println(num * num);
        }
   } 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        try{
            numberCheck(num);
        }catch(IllegalArgumentException e){
            System.out.println("Exeception occured: "+ e.getMessage());
        }
        sc.close();
   }
}
