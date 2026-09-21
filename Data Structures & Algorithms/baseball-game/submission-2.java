class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        for(String s:operations) {
            if(s.equals("+")) {
                int i = st.pop();
                int j = st.peekFirst();
                st.push(i);
                st.push(i+j);
            }
            else if(s.equals("D")) {
                st.push(2*st.peekFirst());
            }
            else if(s.equals("C")) {
                st.pop();
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
        int ans = 0;
        while(!st.isEmpty()) {
            ans+=st.pop();
        }
        return ans;
    }
}