class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while(!st.isEmpty() && st.peek()[1] < temperatures[i]) {
                int[] a = st.pop();
                res[a[0]] = i - a[0];
            }
            st.push(new int[] {i,temperatures[i]});
        }
        return res;
    }
}
