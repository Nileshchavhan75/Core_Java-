public class FindKthBitProgram {

    public static void main(String[] args) {
        
        int n = 3;
        int k = 5;
        
        char result = findKthBit(n, k);
        
        System.out.println("The " + k + "th bit in S" + n + " is: " + result);
    }

    public static char findKthBit(int n, int k) {
        
        if (n == 1) return '0';

        int length = (1 << n) - 1;     // 2^n - 1
        int mid = length / 2 + 1;      // middle position
        
        if (k == mid) return '1';
        
        if (k < mid) {
            return findKthBit(n - 1, k);
        }
        
        // k > mid → mirror + invert
        char ch = findKthBit(n - 1, length - k + 1);
        return ch == '0' ? '1' : '0';
    }
}