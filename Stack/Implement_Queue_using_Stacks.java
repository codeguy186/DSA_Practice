class MyQueue {

    Stack<Integer> ip=new Stack<>();
    Stack<Integer> op=new Stack<>();
    
    public void push(int x) {
        ip.push(x);
    }
    
    public int pop() {
        if(!op.empty()){
            return op.pop();
        }
        else{
            while(!ip.empty()){
                op.push(ip.pop());
            }
        }
        return op.pop();
    }
    
    public int peek() {
        if(!op.empty()){
            return op.peek();
        }
        else{
            while(!ip.empty()){
                op.push(ip.pop());
            }
        }
        return op.peek();
    }
    
    public boolean empty() {
        return ip.empty() && op.empty();
    }
}