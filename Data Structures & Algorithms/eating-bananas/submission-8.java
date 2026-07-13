class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i:piles) {
            max = Math.max(i,max);
        }
        int l = 1;
        int r = max;
        int fans = max;
        while(l<=r) {
            int m = l + (r-l)/2;
            long ans = calT(piles,m);
            if(ans > h) {
                l = m+1;
            } else {
                fans = m;
                r = m-1;
            }
        }
        return fans;
    }
    public long calT(int[] piles, int s) {
        long ans = 0;
        for(int i:piles) {
            ans = ans + (int) (Math.ceil((double)i/s));
        }
        return ans;
    }
}
