package buildingwar.manager;

import buildingwar.playground.*;
import buildingwar.element.parent.*;

public class PlayGroundManager {
	
	private final int ROW_COUNT = 15;
	private final int COL_COUNT = 15;
	
	
	public void start() {
		this.bootstrap();
		this.render();
	}
	
	
	private void bootstrap() {
		
		for(int row = 0; row < ROW_COUNT; row++) {
			for(int col = 0; col < COL_COUNT; col++) {
				
				PlayGround.getInstance().setElement(row, col, new Element(row, col));				
			}
		}
	}
	
	private void render() {
		PlayGround.getInstance().render();
	}

	
	
}
