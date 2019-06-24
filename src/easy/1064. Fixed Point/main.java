class Solution {
	public int fixedPoint(int[] A) {
		int l = 0;
		int h = A.length - 1;
		int lastL = l;
		int lastH = h;
		while (l < h) {
			int mid = (l + h) / 2;
			if (A[mid] == mid) return mid;
			else if (A[mid] < mid) l = mid;
			else h = mid;

			if (l == lastL && h == lastH) break;
			lastL = l;
			lastH = h;
		}

		return -1;
	}
}