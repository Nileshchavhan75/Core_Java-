import java.util.Scanner;
public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 75;
        while (true) {
            System.out.print("Guess Number 1 to 100: ");
            int num = sc.nextInt();
            
            if (num == a) {
                System.out.println("Congrats You guessed the right number.");
                break;
            } else {
                System.out.println("the number is incorrect, Try again.");
            }
        } 
        sc.close(); 
    }
}
