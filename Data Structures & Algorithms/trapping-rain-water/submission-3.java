class Solution {
    public int trap(int[] height) {
        int ans = 0;
        if(height.length < 3) {
            return ans;
        }
        int l = 1;
        int r = height.length - 2;
        int lmax = height[0];
        int rmax = height[height.length-1];
        while(l<=r) {
            if(rmax>lmax) {
                if(lmax - height[l] > 0) {
                    ans = ans + (lmax-height[l]);
                }
                if(lmax < height[l]){
                    lmax = height[l];
                }
                l++;
            }
            else {
                if(rmax - height[r] > 0) {
                    ans = ans + (rmax-height[r]);
                }
                if(rmax < height[r]){
                    rmax = height[r];
                }
                r--;
            }
        }
        return ans;
    }
}
