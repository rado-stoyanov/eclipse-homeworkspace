package units.child;

import units.parent.Unit;
import model.RowCol;

public class Terren extends Unit{
	
	public Terren(int row, int col) {
		this.setSymbol(".");
		this.setRow(row);
		this.setCol(col);
		this.setBreakble(false);
		this.setPassable(true);
	}
	
	public Terren(RowCol coordinates) {
		this.setSymbol(".");
		this.setRow(coordinates.getRow());
		this.setCol(coordinates.getCol());
		this.setBreakble(false);
		this.setPassable(true);
	}
	
}
