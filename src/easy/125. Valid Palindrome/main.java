class Solution {
	public boolean isPalindrome(String s) {
		char[] ar = s.toCharArray();
		int i = 0, j = ar.length - 1;
		//aba
		while (i <= j) {
			while (i < j) {
				if (isUpperCase(ar[i])) ar[i] = toLowerCase(ar[i]);
				if (isLowerCase(ar[i])) break;
				i++;
			}


			while (i < j) {
				if (isUpperCase(ar[j])) ar[j] = toLowerCase(ar[j]);
				if (isLowerCase(ar[j])) break;
				j--;
			}

			// if( i == j ) return isLowerCase(ar[i]) && isLowerCase(ar[j]);
			if (ar[i] != ar[j]) return false;

			i++;
			j--;
		}

		return true;
	}

	boolean isUpperCase(char c) {
		return c >= 'A' && c <= 'Z';
	}

	int d = 'A' - 'a';

	char toLowerCase(char c) {
		return (char) (c - d);
	}

	boolean isLowerCase(char c) {
		return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
	}
}