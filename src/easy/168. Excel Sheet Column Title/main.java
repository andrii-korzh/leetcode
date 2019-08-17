class Solution {

	static final int ALHPABET_LEN = 26;

	public String convertToTitle(int n) {
		String r = "";
		while (n > 0) {
			n--;
			r = (char) (n % ALHPABET_LEN + 'A') + r;
			n /= ALHPABET_LEN;
		}
		return r;
	}
}