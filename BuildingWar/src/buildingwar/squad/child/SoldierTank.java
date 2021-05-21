package buildingwar.squad.child;

import buildingwar.squad.parent.Squad;

public class SoldierTank extends Squad {
	
	public SoldierTank(int row, int col) {
		super(row, col);		
	}

	public SoldierTank(int row, int col, boolean isSoldierLife, boolean isPositionMain) {
		super(row, col, isSoldierLife, isPositionMain);		
	}

	@Override
	public String render() {
		return "1";
	}

	@Override
	public boolean isMovePossible(int row, int col) {
		
		int rowCoefficient = Math.abs(row - this.row);
		int colCoefficient = Math.abs(col - this.col); 
		
		return  rowCoefficient == 1 &&
				colCoefficient == 0;
	}





}
