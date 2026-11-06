class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (s.equals("-")) {
                int a = st.pop(), b = st.pop();
                st.push(b - a);
            } else if (s.equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (s.equals("/")) {
                int a = st.pop(), b = st.pop();
                st.push(b / a);
            } else { // (2) operands only
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}