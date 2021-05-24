package buildingwar.manager;

import buildingwar.buildings.object.MediumBuildingObject;
import buildingwar.contracts.PlayGroundStatus;

public class GameManager {
	
	public static boolean isMoveValid(int row, int col, String actionKey) {
		
		if(actionKey.equals(KeyManager.FORWARD) && row == PlayGroundStatus.MIN_ROW_COUNT) {
			return false;
		}
		if(actionKey.equals(KeyManager.BACKWARD) && row == PlayGroundStatus.MAX_ROW_COUNT) {
			return false;
		}
		if(actionKey.equals(KeyManager.LEFT) && col == PlayGroundStatus.MIN_COL_COUNT) {
			return false;
		}
		if(actionKey.equals(KeyManager.RIGHT) && col == PlayGroundStatus.MAX_COL_COUNT) {
			return false;
		}		
		return true;
	}
	
	public static boolean isMovePossible(int row, int col) {
		
		int notPossableMediumBuildingOneRow = MediumBuildingObject.getInstance().getElement(1).getRow();
		int notPossableMediumBuildingOneCol = MediumBuildingObject.getInstance().getElement(1).getCol();	
		int notPossableMediumBuildingFourRow = MediumBuildingObject.getInstance().getElement(4).getRow();
		int notPossableMediumBuildingFourCol = MediumBuildingObject.getInstance().getElement(4).getCol();
				
		boolean firstOptionForMediumBuilding = (notPossableMediumBuildingOneRow == row) && (notPossableMediumBuildingOneCol == col);
		boolean secondOptionForMediumBuilding = (notPossableMediumBuildingFourRow == row) && (notPossableMediumBuildingFourCol == col);
		
		if(firstOptionForMediumBuilding || secondOptionForMediumBuilding ) {
			return false;
		}
		
		return true;
			
	}
	
	
	
	

}
