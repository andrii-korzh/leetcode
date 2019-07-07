class Solution {
	public int romanToInt(String s) {

		char[] ar = s.toCharArray();
		int n = 0;
		int prev = romanToInt(ar[0]);
		for (int i = 1; i < ar.length; ++i) {
			int c = romanToInt(ar[i]);
			n += prev < c ? -prev : prev;
			prev = c;
		}
		n += prev;

		return n;
	}

	int romanToInt(char c) {
		if (c == 'I') return 1;
		if (c == 'V') return 5;
		if (c == 'X') return 10;
		if (c == 'L') return 50;
		if (c == 'C') return 100;
		if (c == 'D') return 500;
		if (c == 'M') return 1000;

		throw new RuntimeException("");
	}
}