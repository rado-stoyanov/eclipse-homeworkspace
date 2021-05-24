package buildingwar.manager;

import buildingwar.contracts.SquadStatus;
import buildingwar.playground.PlayGroundoObject;
import buildingwar.squad.child.SoldierSniper;
import buildingwar.squad.child.SoldierSpy;
import buildingwar.squad.child.SoldierTank;
import buildingwar.squad.child.SoldierWrecker;
import buildingwar.squad.object.SquadObject;
import buildingwar.squad.parent.Squad;
import buildingwar.surface.Surface;

public class SquadManager {
		
	public void boostrap() {
		createStartSoldiers();
		setSoldiersToPlayGround();		
	}
	
	public void processActionMove(String actionKey) {
		
		int mainSoldierRow = SquadObject.getInstance().getElement(0).getRow();
		int mainSoldierCol = SquadObject.getInstance().getElement(0).getCol();		
		int secondSoldierRow = SquadObject.getInstance().getElement(1).getRow();
		int secondSoldierCol = SquadObject.getInstance().getElement(1).getCol();		
		int thirdSoldierRow = SquadObject.getInstance().getElement(2).getRow();
		int thirdSoldierCol = SquadObject.getInstance().getElement(2).getCol();		
		int fourthSoldierRow = SquadObject.getInstance().getElement(3).getRow();
		int fourthSoldierCol = SquadObject.getInstance().getElement(3).getCol();
				
		if((actionKey.equals(KeyManager.FORWARD)) || (actionKey.equals(KeyManager.BACKWARD))) {
			
				if(GameManager.isMoveValid(mainSoldierRow, mainSoldierCol, actionKey)) {
					int mainSoldierRowMultiplier = getDestinationRow(actionKey);					
					int mainSoldierNewRow = mainSoldierRow + mainSoldierRowMultiplier;
					
					if(GameManager.isMovePossible(mainSoldierNewRow, mainSoldierCol)) {
						SquadObject.getInstance().getElement(0).setRow(mainSoldierNewRow);
						SquadObject.getInstance().getElement(0).setCol(mainSoldierCol);					
						SquadObject.getInstance().getElement(1).setRow(mainSoldierRow);
						SquadObject.getInstance().getElement(1).setCol(mainSoldierCol);						
						SquadObject.getInstance().getElement(2).setRow(secondSoldierRow);
						SquadObject.getInstance().getElement(2).setCol(secondSoldierCol);						
						SquadObject.getInstance().getElement(3).setRow(thirdSoldierRow);
						SquadObject.getInstance().getElement(3).setCol(thirdSoldierCol);
						transformToSurface(fourthSoldierRow, fourthSoldierCol);
					}
				}																																																									
		}
		
		if((actionKey.equals(KeyManager.LEFT)) || (actionKey.equals(KeyManager.RIGHT))) {
			
			if(GameManager.isMoveValid(mainSoldierRow, mainSoldierCol, actionKey)) {
				int mainSoldierColMultiplier = getDestinationCol(actionKey);
				int mainSoldierNewCol = mainSoldierCol + mainSoldierColMultiplier;
				
				if(GameManager.isMovePossible(mainSoldierRow, mainSoldierNewCol)) {
					SquadObject.getInstance().getElement(0).setRow(mainSoldierRow);
					SquadObject.getInstance().getElement(0).setCol(mainSoldierNewCol);						
					SquadObject.getInstance().getElement(1).setRow(mainSoldierRow);
					SquadObject.getInstance().getElement(1).setCol(mainSoldierCol);						
					SquadObject.getInstance().getElement(2).setRow(secondSoldierRow);
					SquadObject.getInstance().getElement(2).setCol(secondSoldierCol);						
					SquadObject.getInstance().getElement(3).setRow(thirdSoldierRow);
					SquadObject.getInstance().getElement(3).setCol(thirdSoldierCol);
					transformToSurface(fourthSoldierRow, fourthSoldierCol);
				}
			}																																				
		}
		setSoldiersToPlayGround();		
	}
	
	public void changeMainSoldierPosition(int ChoosenMainSoldierIndex) {
		
		Squad currentMainSoldier = SquadObject.getInstance().getElement(0);
		int currentMainSoldierRow = currentMainSoldier.getRow();
		int currentMainSoldierCol = currentMainSoldier.getCol();
		
		Squad choosenMainSoldier = SquadObject.getInstance().getElement(ChoosenMainSoldierIndex-1);
		int choosenMainSoldierRow = choosenMainSoldier.getRow();
		int choosenMainSoldierCol = choosenMainSoldier.getCol();
				
		currentMainSoldier.setRow(choosenMainSoldierRow);
		currentMainSoldier.setCol(choosenMainSoldierCol);
		currentMainSoldier.setIsPositionMain(SquadStatus.IS_NOT_MAIN_SOLDIER);
		SquadObject.getInstance().setElement(ChoosenMainSoldierIndex-1, currentMainSoldier);
				
		choosenMainSoldier.setRow(currentMainSoldierRow);
		choosenMainSoldier.setCol(currentMainSoldierCol);
		choosenMainSoldier.setIsPositionMain(SquadStatus.IS_MAIN_SOLDIER);
		SquadObject.getInstance().setElement(0, choosenMainSoldier);
		
		setSoldiersToPlayGround();
	}
	
	private void createStartSoldiers() {
		
		SquadObject.getInstance().setElement(0, new SoldierTank(SquadStatus.START_SOLDIER_ROW_POSITION, 
																	SquadStatus.START_TANK_COL_POSITION, 
																	SquadStatus.IS_SOLDIER_LIFE, 
																	SquadStatus.IS_MAIN_SOLDIER));	
		SquadObject.getInstance().setElement(1, new SoldierSniper(SquadStatus.START_SOLDIER_ROW_POSITION, 
				  													  SquadStatus.START_SNIPER_COL_POSITION, 
				  													  SquadStatus.IS_SOLDIER_LIFE, 
				  													  SquadStatus.IS_NOT_MAIN_SOLDIER));		
		SquadObject.getInstance().setElement(2, new SoldierSpy(SquadStatus.START_SOLDIER_ROW_POSITION, 
				   												   SquadStatus.START_SPY_COL_POSITION, 
				   												   SquadStatus.IS_SOLDIER_LIFE, 
				   												   SquadStatus.IS_NOT_MAIN_SOLDIER));		
		SquadObject.getInstance().setElement(3, new SoldierWrecker(SquadStatus.START_SOLDIER_ROW_POSITION, 
				   													   SquadStatus.START_WRECKER_COL_POSITION, 
				   													   SquadStatus.IS_SOLDIER_LIFE, 
				   													   SquadStatus.IS_NOT_MAIN_SOLDIER));
	}
	
	private void setSoldiersToPlayGround() {		
		for(int i = 0; i < 4; i++) {
			PlayGroundoObject.getInstance().setElement(SquadObject.getInstance().getElement(i).getRow(), 
					SquadObject.getInstance().getElement(i).getCol(), 
					SquadObject.getInstance().getElement(i));			
		}		
	}
		
	private void transformToSurface(int row, int col) {
		PlayGroundoObject.getInstance().setElement(row, col, 
				new Surface(row, col));
	}
		
	private int getDestinationRow(String actionKey) {
		
		int downDrade = -1;
		int upGrade = 1;
		
		if(actionKey.equals(KeyManager.FORWARD)) return downDrade;
		if(actionKey.equals(KeyManager.BACKWARD)) return upGrade;
		return 0;
	}
		
	private int getDestinationCol(String actionKey) {
		
		int downDrade = -1;
		int upGrade = 1;
		
		if(actionKey.equals(KeyManager.LEFT)) return downDrade;
		if(actionKey.equals(KeyManager.RIGHT)) return upGrade;
		return 0;		
	}
	
}
