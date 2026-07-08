class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        int k = 0;
        while(q1.size()>1) {
            q2.offer(q1.poll());
        }
        if(!q1.isEmpty()){
            k = q1.poll();
        }
        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return k;
    }
    
    public int top() {
        while(q1.size()>1) {
            q2.offer(q1.poll());
        }
        if(!q1.isEmpty()) {
            int k = q1.poll();
            q2.offer(k);
            while(!q2.isEmpty()) {
            q1.offer(q2.poll());
            }
            return k;
        }
        return 0;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */