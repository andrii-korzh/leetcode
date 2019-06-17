class Solution {
	int count = 0;
	int rows;
	int columns;
	char [][]grid;
	Deque<int[]> stack = new ArrayDeque();
	public int numIslands( char[][] grid) {
		if( grid == null || grid.length == 0) return 0;
		this.grid = grid;
		rows = grid.length;
		columns = grid[0].length;
		for( int r = 0; r < rows; r++){
			for( int c = 0; c < columns; c++){
				if( grid[r][c] == '1'){
					stack.push(new int[]{r,c});
					traverse();
					count++;
				}
			}
		}
		return count;
	}

	void traverse(){
		while(!stack.isEmpty()) {
			int[]pair = stack.pop();
			int r = pair[0];
			int c = pair[1];
			if( r < 0 || r >= rows) continue;
			if( c < 0 || c >= columns) continue;
			if( grid[r][c] == '0') continue;

			grid[r][c] = '0';
			stack.push(new int[]{r+1,c});
			stack.push(new int[]{r-1,c});
			stack.push(new int[]{r,c+1});
			stack.push(new int[]{r,c-1});
		}
	}
}