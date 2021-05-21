package units.child;

import units.parent.Unit;

public class Hq extends Unit{
	
	public Hq(int row, int col) {
		this.setSymbol("+");
		this.setRow(row);
		this.setCol(col);
		this.setBreakble(false);
	}
}
