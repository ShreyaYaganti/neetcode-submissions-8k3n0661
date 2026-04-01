class MinStack {
    Stack<int[]>stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int min =val;
        if(!stack.isEmpty()){
           int[]node = stack.peek();
           min =Math.min(node[1],val);
          // System.out.println(stack.peek()[0]+" "+stack.peek()[1]);
            }
        
        int[] node1 = new int[]{val,min};
        stack.push(node1);
        
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
        
    }
    
    public int getMin() {
     
            
        
        return stack.peek()[1];
    }
}
