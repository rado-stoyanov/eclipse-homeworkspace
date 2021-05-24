package buildingwar.playground;

public abstract class PlayGround {

	protected int row;
	protected int col;
	protected boolean isPassable;
	
	public PlayGround(int row, int col, boolean isPassable) {
		this.row = row;
		this.col = col;
		this.isPassable = isPassable;
	}
	
	public PlayGround(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
	public boolean getPassablility() {
		return isPassable;
	}

	public void setPassability(boolean isPassable) {
		this.isPassable = isPassable;
	}

	public abstract String render();

}
