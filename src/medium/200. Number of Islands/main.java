class Solution {
	int count = 0;
	int rows;
	int columns;
	char [][]grid;
	public int numIslands( char[][] grid) {
		if( grid == null || grid.length == 0) return 0;
		this.grid = grid;
		rows = grid.length;
		columns = grid[0].length;
		for( int r = 0; r < rows; r++){
			for( int c = 0; c < columns; c++){
				if( grid[r][c] == '1'){
					traverse(r,c);
					count++;
				}
			}
		}
		return count;
	}

	void traverse(int r, int c){
		if( r < 0 || r >= rows) return;
		if( c < 0 || c >= columns) return;
		if( grid[r][c] == '0') return;

		grid[r][c] = '0';
		traverse(r+1, c);
		traverse(r-1, c);
		traverse(r, c+1);
		traverse(r, c-1);
	}
}