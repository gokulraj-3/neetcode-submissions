class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int maxP = 0;
        int r = 0;
        while(r < prices.length) {
            if (prices[r] >= prices[l]) {
                int p = prices[r] - prices[l];
                maxP = Math.max(p,maxP);
                r++;
            } else {

                l++;
            }
        }
        return maxP;
    }
}
