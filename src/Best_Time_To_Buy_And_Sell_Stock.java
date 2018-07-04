class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = Integer.MAX_VALUE, maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minTillNow);
            minTillNow = Math.min(minTillNow, prices[i]);
        }
        return maxProfit;
    }
}
