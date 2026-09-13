class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int rightMax = prices[n-1];
        int maxProfit = 0;

        for(int i=n-2;i>=0;i--){
            maxProfit = Math.max(maxProfit,rightMax-prices[i]);
            rightMax = Math.max(rightMax,prices[i]);
           
        }

        return maxProfit;
    }
}