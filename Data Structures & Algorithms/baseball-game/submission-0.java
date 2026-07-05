class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String o:operations) {
            if("+".equals(o)) {
                int p1 = st.pop();
                int p2 = st.peek();
                st.push(p1);
                st.push(p1+p2);
            }
            else if("D".equals(o)) {
                st.push(2*(st.peek()));
            }
            else if("C".equals(o)) {
                st.pop();
            }
            else {
                st.push(Integer.parseInt(o));
            }
        }
        int ans = 0;
        while(!st.isEmpty()) {
            ans = ans + st.pop();
        }
        return ans;
    }
}