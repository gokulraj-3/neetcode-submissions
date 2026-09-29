class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int ans = 0;
        while(i<=j && j<=prices.length-1) {
            if(prices[i] < prices[j]) {
                ans = Math.max(ans,prices[j]-prices[i]);
            } else {
                i = j;
            }
            j++;
        }
        return ans;
    }
}
