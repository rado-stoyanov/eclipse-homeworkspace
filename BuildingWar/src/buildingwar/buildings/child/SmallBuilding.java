package buildingwar.buildings.child;

import buildingwar.buildings.object.SmallBuildingObject;
import buildingwar.buildings.parent.Building;
import buildingwar.contracts.BuildingStatus;
import buildingwar.playground.PlayGroundoObject;

public class SmallBuilding extends Building{

	public SmallBuilding(int row, int col) {
		super(row, col);
	}
	
	public SmallBuilding(int row, int col, boolean isPassable) {
		super(row, col, isPassable);
	}

	@Override
	public void createBuilding(int rowPosition, int colPosition) {
		int i = 0;
		for(int row = 0; row < BuildingStatus.SMALL_BUILDING_ROW_SIZE; row++) {
			for(int col = 0; col < BuildingStatus.SMALL_BUILDING_COL_SIZE; col++) {
				SmallBuilding smallBuilding = new SmallBuilding((rowPosition+row), (colPosition+col));
				PlayGroundoObject.getInstance().setElement((rowPosition+row), (colPosition+col), smallBuilding);
				SmallBuildingObject.getInstance().setElement(i, smallBuilding);
				i++;
			}
		}
	}

	@Override
	public String render() {
		return "*";
	}

}
