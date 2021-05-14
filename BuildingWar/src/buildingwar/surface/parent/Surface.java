package buildingwar.surface.parent;

import buildingwar.playground.PlayGroundObject;

public class Surface extends PlayGroundObject{

	public Surface(int row, int col) {
		super(row, col);
	}

	@Override
	public String render() {
		return "x";
	}
	
}
