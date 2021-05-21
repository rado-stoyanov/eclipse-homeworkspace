package buildingwar.manager;

import buildingwar.contracts.PlayGroundStatus;
import buildingwar.playground.*;
import buildingwar.surface.*;
import buildingwar.surface.Surface;

public class PlayGroundManager {
		
	public void bootstrap() {
		
		for(int row = 0; row < PlayGroundStatus.ROW_COUNT; row++) {
			for(int col = 0; col < PlayGroundStatus.COL_COUNT; col++) {
				PlayGround.getInstance().setElement(row, col, new Surface(row, col));				
			}
		}
	}
	
}




