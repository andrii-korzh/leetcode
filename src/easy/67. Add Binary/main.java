class Solution {
	public String addBinary(String a, String b) {
		int carry = 0;
		int m = a.length();
		int n = b.length();
		int l = m > n ? m : n;
		char[] ar = new char[l];
		for (int i = 0; i < l; i++) {
			int indexA = m - 1 - i;
			int indexB = n - 1 - i;
			int dA = indexA < 0 ? 0 : a.charAt(indexA) - '0';
			int dB = indexB < 0 ? 0 : b.charAt(indexB) - '0';
			// System.out.println(dA+","+dB+","+carry);
			int r = dA + dB + carry;
			ar[ar.length - 1 - i] = (char) (r % 2 + '0');
			carry = r > 1 ? 1 : 0;
		}

		if (carry == 1) return "1" + new String(ar);

		return new String(ar);
	}
}