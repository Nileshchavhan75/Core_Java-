import java.util.HashMap;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int range = 0;

        for(int x: nums){
            sum+=x;

            if(map.containsKey(sum-k)){
                range += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return range;
    }
}
