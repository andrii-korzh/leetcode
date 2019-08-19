class TwoSum {
	Map<Integer, Integer> m = new HashMap<>();
	List<Integer> l = new ArrayList<>();
	/** Initialize your data structure here. */
	// public TwoSum() {
//
	// }

	/**
	 * Add the number to an internal data structure..
	 */
	public void add(int number) {
		if (m.containsKey(number)) {
			m.put(number, m.get(number) + 1);
		} else {
			m.put(number, m.getOrDefault(number, 0) + 1);
			l.add(number);
		}

	}

	/**
	 * Find if there exists any pair of numbers which sum is equal to the value.
	 */
	public boolean find(int value) {
		for (int i = 0; i < l.size(); i++) {
			int num1 = l.get(i);
			int num2 = value - num1;
			if (num1 == num2) {
				if (m.get(num1) > 1) return true;
			} else if (m.containsKey(num2)) return true;
		}
		return false;
	}
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */