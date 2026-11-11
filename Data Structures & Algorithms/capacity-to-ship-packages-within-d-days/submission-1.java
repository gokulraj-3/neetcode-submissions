class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int h = 0;
        for(int i:weights) {
            if(i > l) {
                l = i;
            }
            h += i;
        }
        int m;
        int ans = h;
        while(l <= h) {
            m = l+(h-l)/2;
            if(check(weights, days, m)) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    public Boolean check(int[] weights, int days, int maxW) {
        int wtn = 0;
        int d = 0;
        int i = 0;
        while(i < weights.length) {
            wtn = wtn+weights[i];
            if(wtn > maxW) {
                wtn = 0;
                d++;
            } 
            else {
                i++;
            }
        }
        if(d+1 > days) {
            return false;
        }
        return true;
    }
}