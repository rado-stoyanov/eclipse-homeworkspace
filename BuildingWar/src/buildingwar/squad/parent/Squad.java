package buildingwar.squad.parent;

import buildingwar.playground.PlayGround;

public abstract class Squad extends PlayGround{
	
	protected boolean isSoldierLife;
	protected boolean isPositionMain;
	
	public Squad(int row, int col) {
		super(row, col, false);
		
	}
	
	public Squad(int row, int col, boolean isSoldierLife, boolean isPositionMain) {
		super(row, col);
		this.isSoldierLife = isSoldierLife;
		this.isPositionMain = isPositionMain;
		
	}

	public boolean getIsSoldierLife() {
		return isSoldierLife;
	}

	public void setIsSoldierLife(boolean isSoldierLife) {
		this.isSoldierLife = isSoldierLife;
	}
	
	
	public boolean getIsPositionMain() {
		return isPositionMain;
	}

	public void setIsPositionMain(boolean isPositionMain) {
		this.isPositionMain = isPositionMain;
	}
	
	public abstract boolean isMovePossible(int row, int col);
	


}
