class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(l<=r) {
            int k = (r+l)/2;
            double tt = 0;
            for (int p:piles){
                tt = tt + Math.ceil((double)p / k);
            }
            if (tt > h) {
                l = k+1;
            } else {
                res = k;
                r = k-1;
            }
        }
        return res;
    }
}
