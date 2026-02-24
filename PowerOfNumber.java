public class PowerOfNumber {
    public static void main(String[] args) {
        int pow = power(2, 5);
        System.out.println(pow); 
    }
    static int power(int n, int b){
        if(b == 0){
            return 1;
        }
        return n * power(n, b-1);
    }
}
