class Solution {
    public int mySqrt(int x) {
        int i = 0;
        int j = x;
        int m = 0;
        while(i<=j) {
            m = i + (j-i)/2;
            long k = (long)m*m;
            if(k == x) {
                return m;
            }
            if(k > x) {
                j = m-1;
            } else {
                i = m+1;
            }
        }
        return j;
    }
}