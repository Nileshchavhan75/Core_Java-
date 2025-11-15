import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Print Table: ");
        int num = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.err.println(i * num);
        }
        sc.close();
    }
}
