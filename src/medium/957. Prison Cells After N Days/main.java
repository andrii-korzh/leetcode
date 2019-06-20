class Solution {
	public int[] prisonAfterNDays(int[] cells, int N) {
		Map<String, Integer> seen = new HashMap<>();
		while (N > 0) {
			int[] copy = new int[8];
			seen.put(Arrays.toString(cells), N--);
			for (int i = 1; i < 7; ++i) {
				copy[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
			}
			cells = copy;
			String key = Arrays.toString(cells);
			if (seen.containsKey(key)) {
				N %= seen.get(key) - N;
			}
		}
		return cells;
	}
}