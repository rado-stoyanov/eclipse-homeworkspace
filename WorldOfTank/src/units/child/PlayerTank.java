package units.child;

import units.parent.Unit;
import model.RowCol;
import manager.GameKeyManager;

public class PlayerTank extends Unit {
	
	public PlayerTank(int row, int col) {
		this.setSymbol("%");
		this.setRow(row);
		this.setCol(col);
		this.setBreakble(true);
		this.setPassable(false);
	}
	
	public void move(RowCol coordinates) {
		this.setRow(coordinates.getRow());
		this.setCol(coordinates.getCol());
	}
	
	public void mode(int row, int col) {
		this.setRow(row);
		this.setCol(col);
	}
	
	public RowCol getDestination(String keyCode) {
		
		int destinationRow = this.getDestinationRow(keyCode);
		int destinationCol = this.getDestinationCol(keyCode);
		return new RowCol(destinationRow, destinationCol);
	}
	
	private int getDestinationRow(String direction) {
		if(direction.equals(GameKeyManager.FORWARD)) return this.getRow() - 1;
		if(direction.equals(GameKeyManager.BACKWARD)) return this.getRow() + 1;
		return this.getRow();
	}
	
	private int getDestinationCol(String  direction) {
		if(direction.equals(GameKeyManager.LEFT)) return this.getCol() - 1;
		if(direction.equals(GameKeyManager.RIGHT)) return this.getCol() + 1;
		return this.getCol();
	}
	
}
