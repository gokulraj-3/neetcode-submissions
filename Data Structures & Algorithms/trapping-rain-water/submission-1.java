class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;
        int l = 1;
        int r = height.length - 2;
        int ans = 0;
        int lmax = height[0];
        int rmax = height[height.length - 1];
        while (l <= r) {
            if (lmax < rmax) {
                if (lmax - height[l] > 0) {
                    ans = ans + lmax - height[l];
                }
                if (lmax < height[l]) {
                    lmax = height[l];
                }
                l++;
            } else {
                if (rmax - height[r] > 0) {
                    ans = ans + rmax - height[r];
                }
                if (rmax < height[r]) {
                    rmax = height[r];
                }
                r--;

            }
        }
        return ans;
    }
}

