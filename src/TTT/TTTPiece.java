package TTT;

import boardgame.PositionsBoard;
import enums.Shape;

public class TTTPiece extends PositionsBoard{
	
	private TTTPosition TTTposition;
	private Shape shape;
	
	public TTTPiece(TTTPosition TTTposition,Integer shapeInt) {
		this.TTTposition = TTTposition;
		if ((shapeInt%2) == 0) {
			this.shape = Shape.X;
		}
		else {
			this.shape = Shape.O;
		}
	}

	public TTTPosition getPositions() {
		return TTTposition;
	}

	public void setPositions(TTTPosition position) {
		this.TTTposition = position;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
}
