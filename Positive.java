import java.util.Scanner;
public class Positive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check it's positive or not ");
        int num1 = sc.nextInt();
        if(num1>0){
            System.out.print("number is positive ");
        }
        else if(num1 < 0){
            System.out.print("number is negative: ");
        }else{
            System.out.print("Zero");
        }
    }
    
}
