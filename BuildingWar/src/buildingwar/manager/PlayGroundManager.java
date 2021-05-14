package buildingwar.manager;

import buildingwar.playground.*;
import buildingwar.surface.parent.*;

public class PlayGroundManager {
	
	private final int ROW_COUNT = 15;
	private final int COL_COUNT = 15;
		
	public void bootstrap() {
		
		for(int row = 0; row < ROW_COUNT; row++) {
			for(int col = 0; col < COL_COUNT; col++) {
				PlayGround.getInstance().setElement(row, col, new Surface(row, col));				
			}
		}
	}
	
}




