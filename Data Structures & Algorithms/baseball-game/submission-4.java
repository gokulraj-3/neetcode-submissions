class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        for(String s:operations) {
            char c = s.charAt(0);
            if(Character.isDigit(c) || (c == '-' && s.length() > 1)) {
                st.push(Integer.parseInt(s));
            }
            else if(c == '+') {
                int i = st.pop();
                int j = st.peekFirst();
                st.push(i);
                st.push(i+j);
            }
            else if(c == 'D') {
                st.push(2*st.peekFirst());
            }
            else {
                st.pop();
            }
        }
        int ans = 0;
        while(!st.isEmpty()) {
            ans+=st.pop();
        }
        return ans;
    }
}