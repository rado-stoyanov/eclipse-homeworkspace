package buildingwar.squad.child;

import buildingwar.squad.parent.Squad;

public class SoldierSpy extends Squad {
	
	public SoldierSpy(int row, int col) {
		super(row, col);
	}

	public SoldierSpy(int row, int col, boolean isSoldierLife) {
		super(row, col, isSoldierLife);
	}

	public SoldierSpy(int row, int col, boolean isSoldierLife, boolean isPositionMain) {
		super(row, col, isSoldierLife, isPositionMain);
	}

	@Override
	public String render() {
		return "3";
	}



}
