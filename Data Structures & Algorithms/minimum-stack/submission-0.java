class MinStack {
    long min;
    Stack<Long> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(0L);
            min = val;
        } else {
            st.push(val-min);
            if(min > val){
                min = val;
            }
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        long a = st.pop();
        if (a < 0) {
            min = min - a;
        }
    }
    
    public int top() {
        long top = st.peek();
        if (top > 0) {
            return (int) (top + min);
        } else {
            return (int) min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}
