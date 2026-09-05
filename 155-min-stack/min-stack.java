class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(minSt.isEmpty()){
            minSt.push(value);
        }
        else{
            minSt.push(Math.min(value,minSt.peek()));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            minSt.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public int getMin() {
       if(minSt.isEmpty()) return -1;
       return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */