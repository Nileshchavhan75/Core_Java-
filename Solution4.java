class Solution4 {
public int singleNonDuplicate(int[] nums) {
        int element = 0;
        for(int x : nums){
            element ^= x;
        }
        return element;
    }
}