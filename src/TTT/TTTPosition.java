package TTT;

import boardgame.Position;

public class TTTPosition {
	
	private char column;
	private Integer row;
	
	public TTTPosition(char column, Integer row) {
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}
	
	public Position toPosition() {
		return new Position(3 - row, column - 'a');
	}
}
