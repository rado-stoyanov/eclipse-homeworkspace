package buildingwar.buildings.object;

import buildingwar.buildings.child.SmallBuilding;
import buildingwar.contracts.BuildingStatus;

public class SmallBuildingObject {
	
	private static SmallBuildingObject internalInstance = null;
	private SmallBuilding[] collection = null;
	
	private SmallBuildingObject() {
		collection = new SmallBuilding[BuildingStatus.SMALL_BUILDING_SIZE_INDEX];
	}
	
	public static SmallBuildingObject getInstance() {
		if(internalInstance == null) {
			internalInstance = new SmallBuildingObject();
		}
		return internalInstance;
	}
	
	public SmallBuilding getElement(int index) {
		return collection[index];
	}
	
	public void setElement(int index, SmallBuilding element) {
		collection[index] = element;
	}

}
