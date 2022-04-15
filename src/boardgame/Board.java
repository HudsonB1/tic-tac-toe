package boardgame;

import TTT.TTTPiece;
import TTT.TTTPosition;

public class Board {
	
	private Integer columns;
	private Integer rows;
	private PositionsBoard[][] board;
	
	public Board(Integer columns, Integer rows) {
		this.columns = columns;
		this.rows = rows;
		board = new PositionsBoard[columns][rows];
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public PositionsBoard[][] getBoard() {
		return board;
	}

	public PositionsBoard positionBoard (Integer column, Integer row) {
		return board[column][row];
	}
	
	public PositionsBoard positionBoard (Position position) {
		return board[position.getColumn()][position.getRow()];
	}
	
	public void placePiece(TTTPosition TTTposition, Integer shapeInt) {
		
		TTTPiece piece = new TTTPiece(TTTposition, shapeInt);
		
		Position position = TTTposition.toPosition();
		
		board[position.getColumn()][position.getRow()] = piece;
		piece.position = position;
	}
}
