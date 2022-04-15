package TTT;

import boardgame.Board;

public class TTTMatch {
	
	private Board board;
	
	public TTTMatch() {
		board = new Board(3, 3);
	}

	public TTTPiece[][] getPieces(){
		TTTPiece[][] mat = new TTTPiece[board.getColumns()][board.getRows()];
		
		for (int i=0; i < board.getRows();  i++) {
			for (int j=0; j < board.getColumns(); j++) {
				mat[i][j] = (TTTPiece)board.positionBoard(i, j);
			}
		}
		return mat;
	}
	
	public void placePiece(TTTPosition TTTposition, Integer shapeInt) {
		board.placePiece(TTTposition, shapeInt);
	}
	
	private static void win(TTTPiece[][] mat) {
		if ((mat[0][0] && mat[0][1]) == mat[0][2]) {
			
		}
	}
}
