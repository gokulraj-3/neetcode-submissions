class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()) {
            min = (long)val;
            st.push(0L);
        } else {
            st.push((long)val - min);
            if(val < min) {
                min = (long)val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) {
            return;
        } else {
            long a = st.pop();
            if(a < 0) {
                min = min - a;
            }
        }
    }
    
    public int top() {
        long a = st.peek();
        if(a > 0) {
            return (int)(a + min);
        } else {
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}
