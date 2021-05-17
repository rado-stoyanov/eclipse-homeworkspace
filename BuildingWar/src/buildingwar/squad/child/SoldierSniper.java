package buildingwar.squad.child;

import buildingwar.squad.parent.Squad;

public class SoldierSniper extends Squad{
	
	public SoldierSniper(int row, int col) {
		super(row, col);
	}

	public SoldierSniper(int row, int col, boolean isSoldierLife) {
		super(row, col, isSoldierLife);
	}

	public SoldierSniper(int row, int col, boolean isSoldierLife, boolean isPositionMain) {
		super(row, col, isSoldierLife, isPositionMain);
	}

	@Override
	public String render() {
		return "2";
	}



}
