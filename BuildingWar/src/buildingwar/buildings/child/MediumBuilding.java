package buildingwar.buildings.child;

import buildingwar.buildings.object.MediumBuildingObject;
import buildingwar.buildings.parent.Building;
import buildingwar.contracts.BuildingStatus;
import buildingwar.playground.PlayGroundoObject;

public class MediumBuilding extends Building{

	public MediumBuilding(int row, int col) {
		super(row, col);
	}
	
	public MediumBuilding(int row, int col, boolean isPassable) {
		super(row, col, isPassable);
	}

	@Override
	public void createBuilding(int rowPosition, int colPosition) {
		int i = 0;
		boolean Passability = true;
		
		for(int row = 0; row < BuildingStatus.MEDIUM_BUILDING_ROW_SIZE; row++) {
			for(int col = 0; col < BuildingStatus.MEDIUM_BUILDING_COL_SIZE; col++) {
				if(i == 1 || i == 4) {
					Passability = false;
				}
				else {
					Passability = true;
				}
				MediumBuilding mediumBuilding =  new MediumBuilding((rowPosition+row), (colPosition+col), Passability);
				PlayGroundoObject.getInstance().setElement((rowPosition+row), (colPosition+col), mediumBuilding);	
				MediumBuildingObject.getInstance().setElement(i++, mediumBuilding);
			}
		}		
	}

	@Override
	public String render() {
		return "%";
	}

}
