class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 0 || k == 0 || nums.length < k) return nums;

		int ri = 0;
		int[] ar = new int[nums.length - k + 1];
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < nums.length; i++) {
			int n = i - k + 1;
			while (!q.isEmpty() && q.peek() < n) q.poll();
			while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) q.pollLast();
			q.offer(i);
			if (i >= k - 1) ar[ri++] = nums[q.peek()];
		}
		return ar;
	}
}