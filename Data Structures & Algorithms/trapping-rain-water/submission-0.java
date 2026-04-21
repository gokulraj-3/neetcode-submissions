class Solution {
    public int trap(int[] height) {
        int lmax = 0;
        int n = height.length;
        int[] rmax = new int[n];
        int ans = 0;
        rmax[n-1] = 0;
        for (int i = n-2;i >= 0;i--) {
            if (height[i+1] > rmax[i+1]) {
                rmax[i] = height[i+1];
            } else {
                rmax[i] = rmax[i+1];
            }
        }
        for (int i = 0; i < n;i++) {
            int wat = Math.min(lmax,rmax[i]) - height[i];
            if (wat > 0){
                ans = ans + wat;
            }
            if (height[i] > lmax){
                lmax = height[i];
            }
        }
        return ans;
    }
}
