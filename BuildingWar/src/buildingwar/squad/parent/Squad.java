package buildingwar.squad.parent;

import buildingwar.playground.PlayGroundObject;

public abstract class Squad extends PlayGroundObject{
	
	protected boolean isSoldierLife;
	protected boolean isPositionMain;
	
	public Squad(int row, int col) {
		super(row, col);
		
	}

	public Squad(int row, int col, boolean isSoldierLife) {
		super(row, col);
		this.isSoldierLife = isSoldierLife;
		
	}
	
	public Squad(int row, int col, boolean isSoldierLife, boolean isPositionMain) {
		super(row, col);
		this.isSoldierLife = isSoldierLife;
		
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

	public void seIsPositionMain(boolean isPositionMain) {
		this.isPositionMain = isPositionMain;
	}
	


}
