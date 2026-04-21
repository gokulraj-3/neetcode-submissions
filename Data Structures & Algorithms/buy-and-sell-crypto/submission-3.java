class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int maxP = 0;
        for (int r = 0;r < prices.length;r++){
            if (prices[r] >= prices[l]) {
                int p = prices[r] - prices[l];
                maxP = Math.max(p,maxP);
            } else {
                l = r;
            }
        }
        return maxP;
    }
}
