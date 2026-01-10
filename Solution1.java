import java.util.Arrays;

class Solution1 {
    public int[] singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums){
            result ^= i;
        }
        
        int diff = result & (-result);
        int a = 0, b= 0;
        for(int i : nums){
            if((i & diff) == 0){
                a ^= i;
            }else{
                b ^= i;
            }
        }
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] arr = {2,1,2,1,5,8,9,9,6,6};
        int[] ans = s.singleNumber(arr);
        System.out.println(Arrays.toString(ans));
        
    }
}