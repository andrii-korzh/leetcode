class Solution {
  public int minSubArrayLen(int s, int[] nums) {
    int n = nums.length;
    int minLen = nums.length + 1;
    int left = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += nums[i];
      while (sum >= s) {
        minLen = Math.min(minLen, i + 1 - left);
        sum -= nums[left++];
      }
    }
    return (minLen != nums.length + 1) ? minLen : 0;
  }
}