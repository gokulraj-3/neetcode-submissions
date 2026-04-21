class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int area = 0;
        while(i<j){
            int tempa = Math.min(heights[i],heights[j])*(j-i);
            if(tempa > area){
                area = tempa;
            }
            if(heights[i] >= heights[j]){
                j--;
            } else {
                i++;
            }
        }
        return area;
    }
}
