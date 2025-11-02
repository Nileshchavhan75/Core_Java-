import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = n.nextInt();
        int reverse = 0;

        while (a != 0) {
            int digit = a % 10;   // Extract the last digit
            reverse = reverse * 10 + digit;  // Add it to the reversed number
            a /= 10;  // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reverse);
    }
}
