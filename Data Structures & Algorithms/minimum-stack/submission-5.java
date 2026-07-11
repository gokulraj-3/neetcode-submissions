class MinStack {
    long min;
    Stack<Long> st;
    public MinStack() {
        min = 0;
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()) {
            min = val;
            st.push(0L);
        } else {
            st.push((long)val - min);
            if (val < min) min = val;
        }
    }
    
    public void pop() {
        long e = st.pop();
        if(e < 0) {
            min = min - e;
        }
    }
    
    public int top() {
        long e = st.peek();
        if (e > 0) return (int)(e + min);
        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}
