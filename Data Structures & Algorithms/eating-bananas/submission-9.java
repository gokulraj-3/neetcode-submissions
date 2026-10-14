class Solution {
    public int minEatingSpeed(int[] piles, int hi) {
        int h = 0;
        for(int i:piles) {
            h = Math.max(h,i);
        }
        int ans = h;
        int l = 1;
        int m = 0;
        while(l<=h) {
            m = l+(h-l)/2;
            long sp = hours(piles,m);
            if(sp <= hi) {
                ans = m;
                h = m-1;
            } else {
                l = m+1;
            }
        }
        return ans;
    }
    public long hours(int[] piles, int s) {
        long ans = 0;
        for(int i:piles){
            ans += (i + s - 1L) / s;
        }
        return ans;
    }
}
