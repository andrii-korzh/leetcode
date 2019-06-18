class Solution {

	public int fib(int N) {
		if( N < 2) {
			return N;
		}

		int []ar = new int[N+1];
		ar[0] = 0;
		ar[1] = 1;
		for( int i = 2; i <= N; i++) {
			ar[i] = ar[i-1] + ar[i-2];
		}

		return ar[N];
	}
}