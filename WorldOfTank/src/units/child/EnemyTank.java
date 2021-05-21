package units.child;

import units.parent.Unit;

public class EnemyTank extends Unit{
	
	public EnemyTank(int row, int col) {
		this.setSymbol("$");
		this.setRow(row);
		this.setCol(col);
		this.setBreakble(false);
	}
}
