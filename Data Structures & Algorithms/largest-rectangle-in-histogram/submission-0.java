class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nexts = nexts(heights);
        int[] prevs = prevs(heights);
        int max = 0;
        for (int i = 0;i < heights.length; i++){
            int area = heights[i] * (nexts[i] - prevs[i] - 1);
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    public int[] prevs(int[] arr) {
        int[] prevs = new int[arr.length];
        Stack<Integer> st = new Stack();
        for (int i = 0;i < arr.length;i++){
            prevs[i] = -1;
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                prevs[i] = st.peek();
            }
            st.push(i);
        }
        return prevs;
    }

    public int[] nexts(int[] arr){
        int[] nexts = new int[arr.length];
        Stack<Integer> st = new Stack();
        for (int i = arr.length-1;i >= 0; i--) {
            nexts[i] = arr.length;
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(!st.isEmpty()) {
                nexts[i] = st.peek();
            }
            st.push(i);
        }
        return nexts;
    }
}
