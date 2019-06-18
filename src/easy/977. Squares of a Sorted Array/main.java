class Solution {
	public int[] sortedSquares(int[] A) {

		// if( true) return Arrays.stream(A).map(val -> val * val).sorted().toArray();
		// /if( A.length > 1000 ) {
		return new Handler(A).handle();
		// } else {
		// return new SortedSquareHandler(A).handle();
		// }
	}

	static class Handler {
		final int[]A;
		Handler(int []A) {
			this.A = A;
		}

		int []handle() {
			for( int i = 0; i < A.length; i++) {
				A[i] = square(i);
			}

			int i = 0;
			int j = A.length - 1;
			int k = A.length - 1;
			int []ar = new int[A.length];
			while( k >= 0 ){
				ar[k--] = (A[i] > A[j]) ? ar[k] = A[i++]: A[j--];
			}

			return ar;
		}

		int square(int i){
			return A[i]*A[i];
		}
	}

	static class InSpaceSortedSquareHandler {
		final int[]A;
		InSpaceSortedSquareHandler(int []A) {
			this.A = A;
		}

		public int[] handle() {
			for( int i = 0; i < A.length; i++){
				A[i] = square(i);
			}
			Arrays.sort(A);
			return A;
		}

		int square(int i){
			return A[i]*A[i];
		}
	}

	static class SortedSquareHandler{
		final int[]A;
		SortedSquareHandler(int []A) {
			this.A = A;
		}

		public int[] handle() {
			int l = 0;
			int r = A.length - 1;
			int []ar = new int[A.length];
			for( int i = ar.length - 1; i >= 0; i--) {
				if( r == -1){
					ar[i] = square(l);
					l++;
					continue;
				} else if ( l == A.length) {
					ar[i] = square(r);
					r--;
					continue;
				}
				int left = square(l);
				int right = square(r);
				if( left > right) {
					ar[i] = left;
					l++;
				} else {
					ar[i] = right;
					r--;
				}
			}
			// Arrays.sort(A);
			return ar;
		}

		int square(int i){
			return A[i]*A[i];
		}
	}
}