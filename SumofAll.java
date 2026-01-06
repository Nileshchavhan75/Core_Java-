import java.util.Scanner;

public class SumofAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] aary = new int[n];
        int sum = 0;
        for(int i = 0; i<aary.length; i++){
            aary[i] = sc.nextInt();
        }

        for(int i = 0; i<aary.length; i++){
            sum += aary[i];
        }
        System.out.println("Total sum of array: "+sum);
        sc.close();
    }
}
