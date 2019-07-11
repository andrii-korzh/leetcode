class Solution {
	public int strStr(String haystack, String needle) {
		boolean isEmpty1 = "".equals(haystack);
		boolean isEmpty2 = "".equals(needle);
		if (isEmpty2) return 0;
		else if (isEmpty1) return -1;
		else if (haystack == null || needle == null) return -1;

		int i = 0;
		int n = haystack.length();
		int m = needle.length();
		while (i < n) {
			char c1 = haystack.charAt(i);
			char c2 = needle.charAt(0);
			if (c1 == c2 && isMatch(i, haystack, needle, n, m)) return i;
			else i++;
		}
		return -1;
	}

	boolean isMatch(int i, String haystack, String needle, int n, int m) {
		int j = 0;
		while (i < n && j < m) {
			char c1 = haystack.charAt(i);
			char c2 = needle.charAt(j);
			if (c1 != c2) return false;
			i++;
			j++;
		}
		return j == needle.length();
	}
}