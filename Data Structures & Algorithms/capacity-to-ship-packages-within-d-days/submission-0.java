class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int l = 0;
        for (int i:weights) {
            sum = sum+i;
            l = Math.max(l,i);
        }
        int r = sum;
        int m;
        int min = sum;
        while(l<=r) {
            m = l+(r-l)/2;
            int d = 1;
            int rem = m;
            for(int j:weights) {
                if (rem >= j) {
                    rem = rem-j;
                }
                else {
                    d++;
                    rem = m-j;
                }
            }
            if(d > days) {
                l = m+1;
            }
            if (d<=days) {
                r = m-1;
                min = Math.min(min,m);
            }
        }
        return min;
    }
}