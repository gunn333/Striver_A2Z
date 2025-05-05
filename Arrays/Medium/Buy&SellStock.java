// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int left_min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i] < left_min){
                left_min = prices[i];
            }
            int p = prices[i] - left_min;
            if(p> profit){
                profit = p;
            }
        }
        return profit;
    }
}
