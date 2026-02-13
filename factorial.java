public class factorial {
    public static void main(String[] args) {
        int result = printFactorial(5);
        System.out.println("Factorial of 5: " + result);
    }
    static int printFactorial(int n){
        if(n == 1){
            return 1;
        }
        return n * printFactorial(n - 1);
    }
}
