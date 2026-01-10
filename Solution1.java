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
}