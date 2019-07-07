class Solution {

	int maxInt = (1 << 31) - 1;
	int minInt = 1 << 31;

	public int reverse(int x) {
		if (x / 10 == 0) return x;

		int[] digits = getDigits(x);
		long m = 1;
		long sum = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			sum += digits[i] * m;
			m *= 10;
		}


		if (sum > maxInt || sum < minInt) {
			return 0;
		}

		return (int) sum;
	}

	int[] getDigits(int x) {
		int[] digits = new int[getLength(x)];

		int i = 0;
		do {
			digits[i] = x % 10;
			i++;
			x /= 10;
		}
		while (x != 0);

		return digits;
	}

	int getLength(int x) {
		int l = 0;
		while (x != 0) {
			x /= 10;
			l++;
		}
		return l;
	}
}