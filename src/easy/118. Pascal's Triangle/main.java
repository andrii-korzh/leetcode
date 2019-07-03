class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> r = new ArrayList<>();
		List<Integer> l = null;
		if (numRows > 0) {
			l = new ArrayList<>();
			l.add(1);
			r.add(l);
		}
		if (numRows > 1) {
			l = new ArrayList<>();
			l.add(1);
			l.add(1);
			r.add(l);
		}
		//System.out.println(numRows);
		helper(r, numRows);
		return r;
	}

	void helper(List<List<Integer>> r, int numRows) {
		if (numRows <= 2) return;

		helper(r, numRows - 1);
		List<Integer> l = new ArrayList<>();
		List<Integer> last = r.get(r.size() - 1);
		l.add(1);
		for (int i = 1; i < last.size(); i++) {
			l.add(last.get(i - 1) + last.get(i));
		}
		l.add(1);
		r.add(l);
	}
}