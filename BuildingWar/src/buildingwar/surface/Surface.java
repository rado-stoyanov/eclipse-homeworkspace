package buildingwar.surface;

import buildingwar.playground.PlayGround;

public class Surface extends PlayGround{

	public Surface(int row, int col) {
		super(row, col, true);
	}

	@Override
	public String render() {
		return "x";
	}
	
}
