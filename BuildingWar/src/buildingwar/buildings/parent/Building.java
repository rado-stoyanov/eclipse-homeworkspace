package buildingwar.buildings.parent;

import buildingwar.playground.PlayGroundObject;

public abstract class Building extends PlayGroundObject{

	public Building(int row, int col) {
		super(row, col);	
	}
	
	public abstract void createBuilding(int rowPosition, int colPosition);

}
