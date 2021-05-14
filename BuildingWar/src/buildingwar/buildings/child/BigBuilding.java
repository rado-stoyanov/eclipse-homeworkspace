package buildingwar.buildings.child;

import buildingwar.buildings.parent.Building;
import buildingwar.playground.PlayGround;

public class BigBuilding extends Building{

	public BigBuilding(int row, int col) {
		super(row, col);
	}

	@Override
	public void createBuilding(int rowPosition, int colPosition) {
		
		final int ROW_COUNT = 3;
		final int COL_COUNT = 3;
		
		for(int row = 0; row < ROW_COUNT; row++) {
			for(int col = 0; col < COL_COUNT; col++) {
				PlayGround.getInstance().setElement((rowPosition+row), (colPosition+col), new BigBuilding((rowPosition+row), (colPosition+col)));				
			}
		}
	}

	@Override
	public String render() {
		return "&";
	}

}
