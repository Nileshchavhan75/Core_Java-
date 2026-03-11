public class ComplementBase10 {

    public static void main(String[] args) {
        int n = 5;
        int result = bitwiseComplement(n);
        System.out.println(result);
    }

    public static int bitwiseComplement(int n) {

        if(n == 0) return 1;

        int mask = 0;
        int temp = n;

        while(temp > 0){
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return n ^ mask;
    }
}