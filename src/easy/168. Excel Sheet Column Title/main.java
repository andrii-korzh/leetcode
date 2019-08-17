class Solution {
	public String convertToTitle(int n) {
		String r = "";
		while (n > 0) {
			n--;
			r = (char) (n % 26 + 'A') + r;
			n /= 26;
		}
		return r;
	}
}