package buildingwar.playground;

import buildingwar.util.Console;

public class PlayGroundoObject {
	
	private static PlayGroundoObject internalInstance = null;
	
	private final int ROW_COUNT = 15;
	private final int COL_COUNT = 15;
	private PlayGround[][] collection = null;
	
	private PlayGroundoObject() {
		collection = new PlayGround[ROW_COUNT][COL_COUNT];
	}
	
	public static PlayGroundoObject getInstance() {
		if(internalInstance == null) {
			internalInstance = new PlayGroundoObject();
		}
		return internalInstance;
	}
	
	public PlayGround getElement(int row, int col) {
		return collection[row][col];
	}
	
	public void setElement(int row, int col, PlayGround element) {
		collection[row][col] = element;
	}
	
	public void render() {
		for(int row = 0 ; row < ROW_COUNT; row++) {
			for(int col = 0; col < COL_COUNT; col++) {
				Console.log(collection[row][col].render());
			}
			Console.logln("");
		}
	}	
}
