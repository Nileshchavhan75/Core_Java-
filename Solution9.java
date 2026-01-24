public class Solution9 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for(int i = 1; i<prices.length; i++){
            int curr_Profit = prices[i] - buy;
            if(curr_Profit > maxProfit){
                maxProfit = curr_Profit;
            }
            if(prices[i] < buy){
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}
