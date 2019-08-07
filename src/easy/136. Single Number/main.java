class Solution {
	public int singleNumber(int[] nums) {
		// if( true) return approach1(nums);

		int sum = 0;
		for (int i = 0; i < nums.length; i++) sum ^= nums[i];
		return sum;
	}

	int approach1(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (set.contains(i)) set.remove(i);
			else set.add(i);
		}

		return set.iterator().next();
	}
}