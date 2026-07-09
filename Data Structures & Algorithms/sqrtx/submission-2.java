class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int l = 0;
        long r = x;
        long m = 0;
        int ans = 1;
        while(l<=r) {
            m = l+(r-l)/2;
            long pr = m*m;
            if(pr == x) {
                return (int)m;
            }
            else if(pr > x) {
                r = m-1;
            }
            else {
                l = (int)m+1;
                ans = (int)m;
            }
        }
        return ans;
    }
}