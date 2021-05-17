package buildingwar.manager;

import buildingwar.playground.PlayGround;
import buildingwar.playground.PlayGroundObject;
import buildingwar.squad.child.SoldierSniper;
import buildingwar.squad.child.SoldierSpy;
import buildingwar.squad.child.SoldierTank;
import buildingwar.squad.child.SoldierWrecker;
import buildingwar.surface.parent.Surface;

public class SquadManager {

	
	public void boostrap() {
		setStartSoldierPositionInLine();	
	}
	
	
	private void setStartSoldierPositionInLine() {

		final int START_SOLDIER_ROW_POSITION 	= 14;
		final int START_TANK_COL_POSITION 		= 11;
		final int START_SNIPER_COL_POSITION 	= 12;
		final int START_SPY_COL_POSITION 		= 13;
		final int START_WRECKER_COL_POSITION 	= 14;
				
		PlayGround.getInstance().setElement(START_SOLDIER_ROW_POSITION, START_TANK_COL_POSITION, 
											new SoldierTank(START_SOLDIER_ROW_POSITION, START_TANK_COL_POSITION, true, true));	
										
		PlayGround.getInstance().setElement(START_SOLDIER_ROW_POSITION, START_SNIPER_COL_POSITION, 
											new SoldierSniper(START_SOLDIER_ROW_POSITION, START_SNIPER_COL_POSITION, true, false));
											
		PlayGround.getInstance().setElement(START_SOLDIER_ROW_POSITION, START_SPY_COL_POSITION, 
											new SoldierSpy(START_SOLDIER_ROW_POSITION, START_SPY_COL_POSITION, true, false));
																								
		PlayGround.getInstance().setElement(START_SOLDIER_ROW_POSITION, START_WRECKER_COL_POSITION, 
											new SoldierWrecker(START_SOLDIER_ROW_POSITION, START_WRECKER_COL_POSITION, true, false));				
	}	
	
	public void processActionMove(String actionKey) {
		
		if((actionKey.equals(KeyManager.FORWARD)) || (actionKey.equals(KeyManager.BACKWARD))) {
			
			int currentTankRow = PlayGround.getInstance().getTankElement().getRow();
			int currentTankCol = PlayGround.getInstance().getTankElement().getCol();
			
			int currentSniperRow = PlayGround.getInstance().getSniperElement().getRow();
			int currentSniperCol = PlayGround.getInstance().getSniperElement().getCol();
			
			int currentSpyRow = PlayGround.getInstance().getSpyElement().getRow();
			int currentSpyCol = PlayGround.getInstance().getSpyElement().getCol();
			
			int currentWreckerRow = PlayGround.getInstance().getWreckerElement().getRow();
			int currentWreckerCol = PlayGround.getInstance().getWreckerElement().getCol();
			
			
			for(int row = 0; row < 15; row++) {
				for(int col = 0; col < 15; col++) {			
					
					PlayGroundObject mainSoldier = PlayGround.getInstance().getElement(row, col);
					
					if (mainSoldier.render().equals("1")) {
						int mainSoldierRowMultiplier = getDestinationRow(actionKey);
						
						PlayGround.getInstance().setElement((row + mainSoldierRowMultiplier), col, 
								new SoldierTank((row + mainSoldierRowMultiplier), col));
						
						PlayGround.getInstance().setElement(currentTankRow, currentTankCol, 
								new SoldierSniper(currentTankRow, currentTankCol));
						
						PlayGround.getInstance().setElement(currentSniperRow, currentSniperCol, 
								new SoldierSpy(currentSniperRow, currentSniperCol));
						
						transformToSurface(currentWreckerRow, currentWreckerCol);
						
						PlayGround.getInstance().setElement(currentSpyRow, currentSpyCol, 
								new SoldierWrecker(currentSpyRow, currentSpyCol));

						return;
						
					}																			
				}
			}
		}
		
		if((actionKey.equals(KeyManager.LEFT)) || (actionKey.equals(KeyManager.RIGHT))) {
			
			int currentTankRow = PlayGround.getInstance().getTankElement().getRow();
			int currentTankCol = PlayGround.getInstance().getTankElement().getCol();
			
			int currentSniperRow = PlayGround.getInstance().getSniperElement().getRow();
			int currentSniperCol = PlayGround.getInstance().getSniperElement().getCol();
			
			int currentSpyRow = PlayGround.getInstance().getSpyElement().getRow();
			int currentSpyCol = PlayGround.getInstance().getSpyElement().getCol();
			
			int currentWreckerRow = PlayGround.getInstance().getWreckerElement().getRow();
			int currentWreckerCol = PlayGround.getInstance().getWreckerElement().getCol();
						
			
			for(int row = 0; row < 15; row++) {
				for(int col = 0; col < 15; col++) {
					
					PlayGroundObject mainSoldier = PlayGround.getInstance().getElement(row, col);
					
					if (mainSoldier.render().equals("1")) {		
						int mainSoldierColMultiplier = getDestinationCol(actionKey);
						
						PlayGround.getInstance().setElement(row, (col + mainSoldierColMultiplier), 
								new SoldierTank(row, (col + mainSoldierColMultiplier)));
						
						PlayGround.getInstance().setElement(currentTankRow, currentTankCol, 
								new SoldierSniper(currentTankRow, currentTankCol));
						
						PlayGround.getInstance().setElement(currentSniperRow, currentSniperCol, 
								new SoldierSpy(currentSniperRow, currentSniperCol));
						
						transformToSurface(currentWreckerRow, currentWreckerCol);
						
						PlayGround.getInstance().setElement(currentSpyRow, currentSpyCol, 
								new SoldierWrecker(currentSpyRow, currentSpyCol));
						
						return;					
					}																			
				}
			}
		}
	}
	
	
	private void transformToSurface(int row, int col) {
		PlayGround.getInstance().setElement(row, col, 
				new Surface(row, col));
	}
	
	
	private int getDestinationRow(String actionKey) {
		
		int downgrade = -1;
		int upgrade = 1;
		
		if(actionKey.equals(KeyManager.FORWARD)) return downgrade;
		if(actionKey.equals(KeyManager.BACKWARD)) return upgrade;
		return 0;
	}
	
	
	private int getDestinationCol(String actionKey) {
		
		int downgrade = -1;
		int upgrade = 1;
		
		if(actionKey.equals(KeyManager.LEFT)) return downgrade;
		if(actionKey.equals(KeyManager.RIGHT)) return upgrade;
		return 0;		
	}

	//TODO
	private boolean isMoveValid() {		
		return true;
	}
	
	
	
}
