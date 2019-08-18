class Solution {

	int type = 0;

	public int majorityElement(int[] nums) {
		switch (type) {
			case 0:
				return Approach1(nums);
			case 1:
				return Approach2(nums);
			default:
				return 0;
		}
	}

	//O(nlogn), O(n)
	int Approach1(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	//O(n), O(1)
	int Approach2(int[] nums) {
		int count = 0;
		Integer candidate = null;
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}

		return candidate;
	}
}