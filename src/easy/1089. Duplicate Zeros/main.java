class Solution {
	public void duplicateZeros(int[] ar) {
		int n = ar.length;
		int zeros = 0;
		for(int i = 0; i < n; i++) {
			if(ar[i] == 0) zeros++;
		}

		int j = n - 1 + zeros;
		for(int i = n - 1; i >= 0; i--) {
			if(j < n) ar[j] = ar[i];
			if(ar[i] == 0) {
				j--;
				if(j < n) ar[j] = 0;
			}
			j--;
			i--;
		}
	}
}