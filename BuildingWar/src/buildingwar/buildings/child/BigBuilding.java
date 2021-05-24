package buildingwar.buildings.child;

import buildingwar.buildings.object.BigBuildingObject;
import buildingwar.buildings.parent.Building;
import buildingwar.contracts.BuildingStatus;
import buildingwar.playground.PlayGroundoObject;

public class BigBuilding extends Building{

	public BigBuilding(int row, int col) {
		super(row, col);
	}
	
	public BigBuilding(int row, int col, boolean isPassable) {
		super(row, col, isPassable);
	}

	@Override
	public void createBuilding(int rowPosition, int colPosition) {
		int i = 0;
		boolean Passability = true;
		
		for(int row = 0; row < BuildingStatus.BIG_BUILDING_ROW_SIZE; row++) {
			for(int col = 0; col < BuildingStatus.BIG_BUILDING_COL_SIZE; col++) {				
				if(i % 2 == 1) {
					Passability = false;
				}
				else {
					Passability = true;
				}
				BigBuilding bigBuilding = new BigBuilding((rowPosition+row), (colPosition+col), Passability);
				PlayGroundoObject.getInstance().setElement((rowPosition+row), (colPosition+col), bigBuilding);	
				BigBuildingObject.getInstance().setElement(i++, bigBuilding);
			}
		}		
	}

	@Override
	public String render() {
		return "&";
	}

}
