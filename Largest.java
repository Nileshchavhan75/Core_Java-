import java.util.Scanner;
public class Largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Value: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 >= num2 && num1 >= num3){
            System.out.print("Largest value "+num1);
        }
        else if(num2>=num3){
            System.out.print("largest value " +num2);
        }
        else{
            System.out.print("largest: "+num3);
        }

    }
}
