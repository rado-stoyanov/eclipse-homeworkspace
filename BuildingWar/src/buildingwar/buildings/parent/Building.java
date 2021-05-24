package buildingwar.buildings.parent;

import buildingwar.playground.PlayGround;

public abstract class Building extends PlayGround{
	
	public Building(int row, int col) {
		super(row, col);
	}
	
	public Building(int row, int col, boolean isPassable) {
		super(row, col, isPassable);
	}

	public abstract void createBuilding(int rowPosition, int colPosition);

}
