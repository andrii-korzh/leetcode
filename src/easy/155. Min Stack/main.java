class MinStack {
	class Node{
		int value;
		int min;
	}
	Deque<Node> stack;

	/** initialize your data structure here. */
	public MinStack() {
		stack = new ArrayDeque<>();
	}

	public void push(int x) {
		Node n = new Node();
		if(stack.isEmpty()) n.min = x;
		else {
			Node n0 = stack.pop();
			n.min = x < n0.min ? x : n0.min;
			stack.push(n0);
		}
		n.value = x;
		stack.push(n);
	}

	public void pop() {
		if( !stack.isEmpty()) stack.pop();
	}

	public int top() {
		// if( stack.isEmpty()) return -99;
		return stack.peek().value;
	}

	public int getMin() {
		//if( stack.isEmpty()) return -99;
		return stack.peek().min;
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */