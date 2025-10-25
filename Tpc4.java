import java.util.*;
public class Tpc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter first Number: ");
            int num = sc.nextInt();
            System.out.print("Enter second Number: ");
            int num2 = sc.nextInt();
            System.out.println("Press 1: Addtion");
            System.out.println("press 2: Subtraction");
            System.out.println("press 3: Multiplication");
            System.out.println("press 4: Division");
            System.out.println("0 for Exit");
            System.out.print("Press the Number to perform operation: ");
            int cal = sc.nextInt();

            switch (cal) {
                case 1: 
                    System.out.println("Result: "+ (num + num2));
                    break;
                case 2:
                    System.out.println("Result:"+ (num -num2));
                    break;
                case 3:
                System.out.println("Result: " + (num * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + ((double) num / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
