//FIXME slow
class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Map<Integer, Integer> m = new HashMap<>();
		for (int x : nums) {
			if (m.get(x) == null) {
				m.put(x, 1);
			} else {
				m.put(x, m.get(x) + 1);
			}
		}


		Set<int[]> t = new HashSet<>();
		Set<List<Integer>> r = new LinkedHashSet<>();
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				//System.out.println(k);
				int wanted = -(nums[i] + nums[j]);
				long counter = 1;
				if (nums[i] == wanted) counter++;
				if (nums[j] == wanted) counter++;
				if (!m.containsKey(wanted) || m.get(wanted) < counter) continue;

				List<Integer> l = new ArrayList(3);
				l.add(nums[i]);
				l.add(nums[j]);
				l.add(wanted);
				Collections.sort(l);
				r.add(l);

			}
		}
		return new ArrayList<>(r);
	}
}