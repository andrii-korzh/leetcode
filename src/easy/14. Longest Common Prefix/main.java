class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0 || strs[0].length() == 0) return "";
		int j = getIndex(strs);
		char[] ar = new char[j];
		for (int i = 0; i < j; i++) {
			ar[i] = strs[0].charAt(i);
		}

		return new String(ar);
	}

	int getIndex(String[] strs) {
		int n = strs.length;
		int m = strs[0].length();
		int i = 0;
		for (; i < m; i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < n; j++) {
				if (i == strs[j].length()) return i;
				if (strs[j].charAt(i) != c) return i;
			}
		}
		return i;
	}
}