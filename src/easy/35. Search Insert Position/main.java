class Solution {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int h = nums.length;
		while (l < h) {
			int m = (l + h) / 2;
			if (target < nums[m]) h = m;
			else if (target > nums[m]) l = m + 1;
			else if (nums[m] == target) return m;
		}

		return l;
	}
}