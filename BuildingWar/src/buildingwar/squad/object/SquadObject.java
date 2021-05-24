package buildingwar.squad.object;

import buildingwar.contracts.SquadStatus;
import buildingwar.squad.parent.Squad;

public class SquadObject {
	
	private static SquadObject internalInstance = null;
	private Squad[] collection = null;
	
	private SquadObject() {
		collection = new Squad[SquadStatus.SQUAD_COUNT_INDEX];
	}
	
	public static SquadObject getInstance() {
		if(internalInstance == null) {
			internalInstance = new SquadObject();
		}
		return internalInstance;
	}
	
	public Squad getElement(int index) {
		return collection[index];
	}
	
	public void setElement(int index, Squad element) {
		collection[index] = element;
	}

}
