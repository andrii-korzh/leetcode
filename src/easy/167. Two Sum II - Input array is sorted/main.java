class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int l = 0;
		int h = numbers.length - 1;
		while (l < h) {
			int sum = numbers[l] + numbers[h];
			if (sum == target) return new int[]{l + 1, h + 1};
			else if (sum < target) l++;
			else if (sum > target) h--;
		}
		return null;

		//return withSet(numbers,target);
	}


	//O(n),O(n)
	// int[] withSet(int[] numbers, int target) {
	//   Map<Integer,Integer> map = new HashMap<>();
	//   for( int i = 0; i < numbers.length;i++) {
	//     int key = target - numbers[i];
	//     Integer value = map.get(key);
	//     if( value == null) {
	//       map.put(numbers[i],i+1);
	//     } else return new int[]{value,i+1};
	//   }
	//   return null;
	// }
}