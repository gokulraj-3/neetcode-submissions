class Solution {
    public int maxArea(int[] heights) {
        int k1 = 0;
        int k2 = heights.length -1;
        int max = 0;
        while(k1 < k2) {
            int w = Math.min(heights[k1],heights[k2])*(k2-k1);
            max = Math.max(max,w);
            if(heights[k1] <= heights[k2]) {
                k1++;
            } else {
                k2--;
            }
        }
        return max;
    }
}
