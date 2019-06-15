class Solution {
	public int longestValidParentheses(String s) {
		int len = 0;
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(-1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
				continue;
			}

			stack.pop();
			if (stack.isEmpty()) {
				stack.push(i);
				continue;
			}

			len = Math.max(len, i - stack.peek());
		}
		return len;
	}
}