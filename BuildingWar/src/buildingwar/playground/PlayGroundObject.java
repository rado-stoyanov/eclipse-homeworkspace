package buildingwar.playground;

public abstract class PlayGroundObject {

	protected int row;
	protected int col;
	
	public PlayGroundObject(int row, int col) {
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
	
	public abstract String renderElement();

}