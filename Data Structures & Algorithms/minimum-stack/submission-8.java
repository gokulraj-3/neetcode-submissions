class MinStack {
    long min;
    Deque<Long> st;
    public MinStack() {
        st = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()) {
            st.push(0L);
            min = val;
        } else {
            st.push((long) val - min);
            min = Math.min(min, (long) val);
        }
    }
    
    public void pop() {
        long p = st.pop();
        if (p < 0) {
            min = min - p;
        }
    }
    
    public int top() {
        long diff = st.peek();
        if (diff > 0) {
            return (int) (diff + min);
        } else {
            return (int) min;
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
