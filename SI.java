public class SI{
    public int singleNumber(int[] nums) {
        int ans = 0, ans2 = 0;
        for(int i = 0; i<nums.length; i++){
            ans ^= nums[i] & ~ans2;
            ans2 ^= nums[i] & ~ans;
        }
        return ans;
    }
}
