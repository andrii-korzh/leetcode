class Solution {
	public int[][] generateMatrix(int n) {
		int matrix[][] = new int[n][n];
		int rMin = 0;
		int cMin = 0;
		int rMax = n - 1;
		int cMax = n - 1;

		int i = 1;
		int four = 0;
		while (cMin <= cMax && rMin <= rMax) {
			int d = four % 4;
			if (d == 0) i = right(matrix, rMin++, cMin, cMax, i);
			else if (d == 1) i = down(matrix, cMax--, rMin, rMax, i);
			else if (d == 2) i = left(matrix, rMax--, cMax, cMin, i);
			else if (d == 3) i = top(matrix, cMin++, rMax, rMin, i);
			four++;
		}

		return matrix;
	}

	int right(int[][] matrix, int r, int cMin, int cMax, int step) {
		for (int i = cMin; i <= cMax; i++) matrix[r][i] = step++;
		return step;
	}

	int left(int[][] matrix, int r, int cMax, int cMin, int step) {
		for (int i = cMax; i >= cMin; i--) matrix[r][i] = step++;
		return step;
	}

	int down(int[][] matrix, int c, int rMin, int rMax, int step) {
		for (int i = rMin; i <= rMax; i++) matrix[i][c] = step++;
		return step;
	}

	int top(int[][] matrix, int c, int rMax, int rMin, int step) {
		for (int i = rMax; i >= rMin; i--) matrix[i][c] = step++;
		return step;
	}
}