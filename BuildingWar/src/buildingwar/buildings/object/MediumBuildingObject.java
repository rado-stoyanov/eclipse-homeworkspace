package buildingwar.buildings.object;

import buildingwar.buildings.child.MediumBuilding;
import buildingwar.contracts.BuildingStatus;

public class MediumBuildingObject {
	
	private static MediumBuildingObject internalInstance = null;
	private MediumBuilding[] collection = null;
	
	private MediumBuildingObject() {
		collection = new MediumBuilding[BuildingStatus.MEDIUM_BUILDING_SIZE_INDEX];
	}
	
	public static MediumBuildingObject getInstance() {
		if(internalInstance == null) {
			internalInstance = new MediumBuildingObject();
		}
		return internalInstance;
	}
	
	public MediumBuilding getElement(int index) {
		return collection[index];
	}
	
	public void setElement(int index, MediumBuilding element) {
		collection[index] = element;
	}

}
