package units.parent;

import model.RowCol;

public class Unit {
	
	protected int row;	
	protected int col;
	protected String symbol;
	protected boolean isBreakble;
	protected boolean isPassable;
	
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
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String simbol) {
		this.symbol = simbol;
	}
	
	public boolean isBreakble() {
		return isBreakble;
	}
	public void setBreakble(boolean isBreakble) {
		this.isBreakble = isBreakble;
	}
	
	public boolean isPassable() {
		return isPassable;
	}
	public void setPassable(boolean isPossable) {
		this.isPassable = isPossable;
	}
	
	public RowCol getRowCol() {
		return new RowCol(this.getRow(), this.getCol());
	}
	
	public boolean isHittable() {
		return !this.isPassable;
	}


}
