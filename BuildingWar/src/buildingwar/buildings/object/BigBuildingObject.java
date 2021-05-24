package buildingwar.buildings.object;

import buildingwar.buildings.child.BigBuilding;
import buildingwar.contracts.BuildingStatus;

public class BigBuildingObject {
	
	private static BigBuildingObject internalInstance = null;
	private BigBuilding[] collection = null;
	
	private BigBuildingObject() {
		collection = new BigBuilding[BuildingStatus.BIG_BUILDING_SIZE_INDEX];
	}
	
	public static BigBuildingObject getInstance() {
		if(internalInstance == null) {
			internalInstance = new BigBuildingObject();
		}
		return internalInstance;
	}
	
	public BigBuilding getElement(int index) {
		return collection[index];
	}
	
	public void setElement(int index, BigBuilding element) {
		collection[index] = element;
	}

}
