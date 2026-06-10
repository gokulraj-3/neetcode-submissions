class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for (int i : piles) {
            if(i>max) {
                max = i;
            }
        }
        int l = 1;
        int r = max;
        int res = r;
        while(l <= r) {
            int m = l + (r - l) / 2;
            double tt = 0;
            for(int j:piles) {
                tt = tt + Math.ceil((double)j/m);
            }
            if (tt > h) {
                l = m+1;
            } else {
                res = m;
                r = m-1;
            }
        }
        return res;
    }
}
