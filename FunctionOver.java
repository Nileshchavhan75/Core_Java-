import java.util.*;

public class FunctionOver {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static float sum1(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Sum of first two: " + sum(x, y));
        System.out.println("Sum of all three: " + sum(x, y, z));
        System.out.println("Sum of first two as floats: " + sum1(x, y));
        sc.close();
    }
}
