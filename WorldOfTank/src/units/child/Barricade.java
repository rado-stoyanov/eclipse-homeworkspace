package units.child;

import units.parent.Unit;

public class Barricade extends Unit {
	
	public Barricade(int row, int col) {
		this.setSymbol("#");
		this.setRow(row);
		this.setCol(col);
		this.setBreakble(false);
	}
	
	public Barricade(int row, int col, boolean isBreakable) {
		this.setSymbol("&");
		this.setRow(row);
		this.setCol(col);
		this.setBreakble(isBreakable);
	}

}
