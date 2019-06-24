class Solution {
	public int lenLongestFibSubseq(int[] A) {
		int n = A.length;
		Map<Integer, Integer> index = new HashMap();
		for (int i = 0; i < n; ++i) index.put(A[i], i);

		Map<Integer, Integer> longest = new HashMap();
		int ans = 0;
		for (int i = 0; i < n; ++i)
			for (int j = 0; j < i; ++j) {
				int k = index.getOrDefault(A[i] - A[j], -1);
				if (k >= 0 && k < j) {
					int cand = longest.getOrDefault(k * n + j, 2) + 1;
					longest.put(j * n + i, cand);
					ans = Math.max(ans, cand);
				}
			}

		return ans >= 3 ? ans : 0;
	}
}