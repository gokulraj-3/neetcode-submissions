class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack();
        int res = 0;
        for (int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]) {
                int h = heights[st.pop()];
                int r = i;
                int l = (st.isEmpty()) ? -1:st.peek();
                int area = h * (r-l-1);
                if (area > res){
                    res = area;
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            int l = (st.isEmpty()) ? -1:st.peek();
            int area = h*(heights.length-l-1);
            if (area > res){
                res = area;
            }
        }
        return res;
    }
}
