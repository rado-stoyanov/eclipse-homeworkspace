package buildingwar.playground;

import buildingwar.util.Console;

public class PlayGround {
	
	private static PlayGround internalInstance = null;
	
	private final int ROW_COUNT = 15;
	private final int COL_COUNT = 15;
	private PlayGroundObject[][] collection = null;
	
	private PlayGround() {
		collection = new PlayGroundObject[ROW_COUNT][COL_COUNT];
	}
	
	public static PlayGround getInstance() {
		if(internalInstance == null) {
			internalInstance = new PlayGround();
		}
		return internalInstance;
	}
	
	public PlayGroundObject getElement(int row, int col) {
		return collection[row][col];
	}
	
	public void setElement(int row, int col, PlayGroundObject element) {
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
