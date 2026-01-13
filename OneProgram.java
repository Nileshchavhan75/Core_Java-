public class OneProgram {
    int hammingWeight(int n) {
        int count = 0;
        for(int i = 32; i>=0; i--){
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }
}

