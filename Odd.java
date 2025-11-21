import java .util.Scanner;
public class Odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yhe number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.print("Number is even");
        }else{
            System.out.print("odd");
        }

    }
}