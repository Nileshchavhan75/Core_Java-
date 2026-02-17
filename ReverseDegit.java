public class ReverseDegit {
    static int reverse;
    public static void main(String[] args) {
        reverseDegit(1234);
        System.out.println(reverse);
    }
    static void reverseDegit(int n){
        if(n==0){
            return ;
        }
        int degit = n % 10;
        reverse = reverse * 10 + degit;
        reverseDegit(n/10);
    }
}
