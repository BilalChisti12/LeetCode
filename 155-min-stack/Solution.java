class MinStack {
    Deque<Integer> stack;
    public ArrayList<Integer> min = new ArrayList<>();
    public MinStack() {
        stack = new ArrayDeque<>();
        min.add(Integer.MAX_VALUE);
    }
    public void push(int val) {
        int last = min.get(min.size()-1);
        int mini = Math.min(last, val);
        if(mini == val){
            min.add(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        int idx = min.size()-1;
        int last = min.get(idx);
        if(stack.peek() == last){
            min.remove(idx);
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.get(min.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */