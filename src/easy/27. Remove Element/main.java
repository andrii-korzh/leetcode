class Solution {
	public int removeElement(int[] nums, int val) {
		int l = 0;
		int h = nums.length;
		while (l < h) {
			if (nums[l] == val) nums[l] = nums[--h];
			else l++;
		}

		return h;
	}
}