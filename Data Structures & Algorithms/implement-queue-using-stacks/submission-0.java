class MyQueue {
    Deque<Integer> i1;
    Deque<Integer> i2 ;
    public MyQueue() {
        i1 = new ArrayDeque<>();
        i2  = new ArrayDeque<>();
    }
    
    public void push(int x) {
        i1.push(x);
    }
    
    public int pop() {
        while(i1.size() != 1) {
            i2.push(i1.pop());
        }
        int x = i1.pop();
        while(i2.size() != 0) {
            i1.push(i2.pop());
        }
        return x;
    }
    
    public int peek() {
        while(i1.size() != 1) {
            i2.push(i1.pop());
        }
        int x = i1.peek();
        while(i2.size() != 0) {
            i1.push(i2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return i1.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */