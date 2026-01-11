public class BitSolution {
    public int rangeBitwiseAnd(int left, int right) {
        int range = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            range++;
        }
        return left << range;
    }
}
