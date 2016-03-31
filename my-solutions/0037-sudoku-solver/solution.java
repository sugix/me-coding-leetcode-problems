public class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
			return;
		}
		solve(board);
    }
    
    public boolean solve(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != '.') {
					continue;
				}
				
				for (int k = 1; k <= 9; k++) {
					board[i][j] = (char) (k + '0');
					if (isValid(board, i, j) && solve(board)) {
						return true; // last step return,
									// it will go back with true until the first one, return final result
					}
					board[i][j] = '.';
				}
				
				return false; // tried 1-9, just return false and don't try next, return to previous.
			}	
		}
		
		return true; // all points are filled --> true. the last step
	}

	private boolean isValid(char[][] board, int a, int b) {
		HashSet<Character> contained = new HashSet<Character>();
		// Check a row
		for (int i = 0; i < 9; i++) {
			if (contained.contains(board[a][i])) {
				return false;
			}
			if (board[a][i] > '0' && board[a][i] <= '9') {
				contained.add(board[a][i]);
			}
		}
		
		
		// Check b column
		contained.clear();
		for (int i = 0; i < 9; i++) {
			if (contained.contains(board[i][b])) {
				return false;
			}
			if (board[i][b] > '0' && board[i][b] <= '9') {
				contained.add(board[i][b]);
			}
		}
		
		// Check sub-box board[a][b] located.
		contained.clear();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int x = a / 3 * 3 + i, y = b / 3 * 3 + j;
				if (contained.contains(board[x][y])) {
					return false;
				}
				
				if (board[x][y] > '0' && board[x][y] <= '9') {
					contained.add(board[x][y]);
				}
			}
		}		
		
		return true;
	}
}
