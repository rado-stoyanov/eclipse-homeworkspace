package buildingwar.squad.child;

import buildingwar.squad.parent.Squad;

public class SoldierTank extends Squad {
	
	public SoldierTank(int row, int col) {
		super(row, col);		
	}

	public SoldierTank(int row, int col, boolean isSoldierLife) {
		super(row, col, isSoldierLife);		
	}

	public SoldierTank(int row, int col, boolean isSoldierLife, boolean isPositionMain) {
		super(row, col, isSoldierLife, isPositionMain);		
	}

	@Override
	public String render() {
		return "1";
	}





}
