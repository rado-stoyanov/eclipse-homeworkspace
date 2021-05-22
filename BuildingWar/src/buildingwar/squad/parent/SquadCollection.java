package buildingwar.squad.parent;

public class SquadCollection {
	
	private static SquadCollection internalInstance = null;
	
	private final int INDEX = 4;
	private Squad[] collection = null;
	
	private SquadCollection() {
		collection = new Squad[INDEX];
	}
	
	public static SquadCollection getInstance() {
		if(internalInstance == null) {
			internalInstance = new SquadCollection();
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
