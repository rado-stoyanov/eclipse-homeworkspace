package buildingwar.manager;

import buildingwar.contracts.SoldierStatus;
import buildingwar.playground.PlayGround;
import buildingwar.squad.child.SoldierSniper;
import buildingwar.squad.child.SoldierSpy;
import buildingwar.squad.child.SoldierTank;
import buildingwar.squad.child.SoldierWrecker;
import buildingwar.squad.parent.Squad;
import buildingwar.squad.parent.SquadCollection;
import buildingwar.surface.Surface;

public class SquadManager {
		
	public void boostrap() {
		createStartSoldiers();
		setSoldiersToPlayGround();		
	}
	
	public void processActionMove(String actionKey) {
		
		int mainSoldierRow = SquadCollection.getInstance().getElement(0).getRow();
		int mainSoldierCol = SquadCollection.getInstance().getElement(0).getCol();		
		int secondSoldierRow = SquadCollection.getInstance().getElement(1).getRow();
		int secondSoldierCol = SquadCollection.getInstance().getElement(1).getCol();		
		int thirdSoldierRow = SquadCollection.getInstance().getElement(2).getRow();
		int thirdSoldierCol = SquadCollection.getInstance().getElement(2).getCol();		
		int fourthSoldierRow = SquadCollection.getInstance().getElement(3).getRow();
		int fourthSoldierCol = SquadCollection.getInstance().getElement(3).getCol();
				
		if((actionKey.equals(KeyManager.FORWARD)) || (actionKey.equals(KeyManager.BACKWARD))) {
					
						int mainSoldierRowMultiplier = getDestinationRow(actionKey);
						
						SquadCollection.getInstance().getElement(0).setRow(mainSoldierRow + mainSoldierRowMultiplier);
						SquadCollection.getInstance().getElement(0).setCol(mainSoldierCol);					
						SquadCollection.getInstance().getElement(1).setRow(mainSoldierRow);
						SquadCollection.getInstance().getElement(1).setCol(mainSoldierCol);						
						SquadCollection.getInstance().getElement(2).setRow(secondSoldierRow);
						SquadCollection.getInstance().getElement(2).setCol(secondSoldierCol);						
						SquadCollection.getInstance().getElement(3).setRow(thirdSoldierRow);
						SquadCollection.getInstance().getElement(3).setCol(thirdSoldierCol);																																																				
		}
		
		if((actionKey.equals(KeyManager.LEFT)) || (actionKey.equals(KeyManager.RIGHT))) {
							
						int mainSoldierColMultiplier = getDestinationCol(actionKey);	
						
						SquadCollection.getInstance().getElement(0).setRow(mainSoldierRow);
						SquadCollection.getInstance().getElement(0).setCol(mainSoldierCol + mainSoldierColMultiplier);						
						SquadCollection.getInstance().getElement(1).setRow(mainSoldierRow);
						SquadCollection.getInstance().getElement(1).setCol(mainSoldierCol);						
						SquadCollection.getInstance().getElement(2).setRow(secondSoldierRow);
						SquadCollection.getInstance().getElement(2).setCol(secondSoldierCol);						
						SquadCollection.getInstance().getElement(3).setRow(thirdSoldierRow);
						SquadCollection.getInstance().getElement(3).setCol(thirdSoldierCol);																													
		}
		setSoldiersToPlayGround();
		transformToSurface(fourthSoldierRow, fourthSoldierCol);
	}
	
	public void changeMainSoldierPosition(int ChoosenMainSoldierIndex) {
		
		Squad currentMainSoldier = SquadCollection.getInstance().getElement(0);
		int currentMainSoldierRow = currentMainSoldier.getRow();
		int currentMainSoldierCol = currentMainSoldier.getCol();
		
		Squad choosenMainSoldier = SquadCollection.getInstance().getElement(ChoosenMainSoldierIndex-1);
		int choosenMainSoldierRow = choosenMainSoldier.getRow();
		int choosenMainSoldierCol = choosenMainSoldier.getCol();
				
		currentMainSoldier.setRow(choosenMainSoldierRow);
		currentMainSoldier.setCol(choosenMainSoldierCol);
		currentMainSoldier.setIsPositionMain(SoldierStatus.IS_NOT_MAIN_SOLDIER);
		SquadCollection.getInstance().setElement(ChoosenMainSoldierIndex-1, currentMainSoldier);
				
		choosenMainSoldier.setRow(currentMainSoldierRow);
		choosenMainSoldier.setCol(currentMainSoldierCol);
		choosenMainSoldier.setIsPositionMain(SoldierStatus.IS_MAIN_SOLDIER);
		SquadCollection.getInstance().setElement(0, choosenMainSoldier);
		
		setSoldiersToPlayGround();
	}
	
	private void createStartSoldiers() {
		
		SquadCollection.getInstance().setElement(0, new SoldierTank(SoldierStatus.START_SOLDIER_ROW_POSITION, 
																	SoldierStatus.START_TANK_COL_POSITION, 
																	SoldierStatus.IS_SOLDIER_LIFE, 
																	SoldierStatus.IS_MAIN_SOLDIER));	
		SquadCollection.getInstance().setElement(1, new SoldierSniper(SoldierStatus.START_SOLDIER_ROW_POSITION, 
				  													  SoldierStatus.START_SNIPER_COL_POSITION, 
				  													  SoldierStatus.IS_SOLDIER_LIFE, 
				  													  SoldierStatus.IS_NOT_MAIN_SOLDIER));		
		SquadCollection.getInstance().setElement(2, new SoldierSpy(SoldierStatus.START_SOLDIER_ROW_POSITION, 
				   												   SoldierStatus.START_SPY_COL_POSITION, 
				   												   SoldierStatus.IS_SOLDIER_LIFE, 
				   												   SoldierStatus.IS_NOT_MAIN_SOLDIER));		
		SquadCollection.getInstance().setElement(3, new SoldierWrecker(SoldierStatus.START_SOLDIER_ROW_POSITION, 
				   													   SoldierStatus.START_WRECKER_COL_POSITION, 
				   													   SoldierStatus.IS_SOLDIER_LIFE, 
				   													   SoldierStatus.IS_NOT_MAIN_SOLDIER));
	}
	
	private void setSoldiersToPlayGround() {
		PlayGround.getInstance().setElement(SquadCollection.getInstance().getElement(0).getRow(), 
											SquadCollection.getInstance().getElement(0).getCol(), 
											SquadCollection.getInstance().getElement(0));				
		PlayGround.getInstance().setElement(SquadCollection.getInstance().getElement(1).getRow(), 
											SquadCollection.getInstance().getElement(1).getCol(), 
											SquadCollection.getInstance().getElement(1));				
		PlayGround.getInstance().setElement(SquadCollection.getInstance().getElement(2).getRow(), 
											SquadCollection.getInstance().getElement(2).getCol(), 
											SquadCollection.getInstance().getElement(2));																	
		PlayGround.getInstance().setElement(SquadCollection.getInstance().getElement(3).getRow(), 
											SquadCollection.getInstance().getElement(3).getCol(), 
											SquadCollection.getInstance().getElement(3));		
	}
		
	private void transformToSurface(int row, int col) {
		PlayGround.getInstance().setElement(row, col, 
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
		
	//TODO
	private boolean isMoveValid() {		
		return true;
	}
	
	
}
