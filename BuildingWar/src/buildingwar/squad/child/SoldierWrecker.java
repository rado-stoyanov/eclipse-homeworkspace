package buildingwar.squad.child;

import buildingwar.squad.parent.Squad;

public class SoldierWrecker extends Squad {
	
	public SoldierWrecker(int row, int col) {
		super(row, col);
	}

	public SoldierWrecker(int row, int col, boolean isSoldierLife) {
		super(row, col, isSoldierLife);
	}

	public SoldierWrecker(int row, int col, boolean isSoldierLife, boolean isPositionMain) {
		super(row, col, isSoldierLife, isPositionMain);
	}

	@Override
	public String render() {
		return "4";
	}


}
