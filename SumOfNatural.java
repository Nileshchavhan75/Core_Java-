public class SumOfNatural {
    public static void main(String[] args) {
        int result = sumOf(10);
        System.out.println(result);
    }
    static int sumOf(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOf(n-1);
    }
}
