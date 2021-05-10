package buildingwar.element.parent;

import buildingwar.playground.PlayGroundObject;

public class Element extends PlayGroundObject{

	public Element(int row, int col) {
		super(row, col);
	}

	@Override
	public String renderElement() {
		return "x";
	}
	
}
