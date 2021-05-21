package buildingwar.manager;

import java.util.ArrayList;

import buildingwar.contracts.PlayGroundStatus;
import buildingwar.contracts.SoldierStatus;
import buildingwar.playground.PlayGround;
import buildingwar.playground.PlayGroundObject;
import buildingwar.squad.child.SoldierSniper;
import buildingwar.squad.child.SoldierSpy;
import buildingwar.squad.child.SoldierTank;
import buildingwar.squad.child.SoldierWrecker;
import buildingwar.squad.parent.Squad;
import buildingwar.surface.Surface;
import buildingwar.util.Console;

public class SquadManager {
	
	int currentTankRow = PlayGround.getInstance().getTankElement().getRow();
	int currentTankCol = PlayGround.getInstance().getTankElement().getCol();	
	int currentSniperRow = PlayGround.getInstance().getSniperElement().getRow();
	int currentSniperCol = PlayGround.getInstance().getSniperElement().getCol();	
	int currentSpyRow = PlayGround.getInstance().getSpyElement().getRow();
	int currentSpyCol = PlayGround.getInstance().getSpyElement().getCol();	
	int currentWreckerRow = PlayGround.getInstance().getWreckerElement().getRow();
	int currentWreckerCol = PlayGround.getInstance().getWreckerElement().getCol();
	
	private ArrayList<Squad> squadCollection = new ArrayList<Squad>();
		
	public void boostrap() {
		setStartSoldierPositionInLine();	
	}
	
	
	private void setStartSoldierPositionInLine() {
				
		PlayGround.getInstance().setElement(SoldierStatus.START_SOLDIER_ROW_POSITION, SoldierStatus.START_TANK_COL_POSITION, 
											new SoldierTank(SoldierStatus.START_SOLDIER_ROW_POSITION, 
															SoldierStatus.START_TANK_COL_POSITION, 
															SoldierStatus.IS_SOLDIER_LIFE, 
															SoldierStatus.IS_MAIN_SOLDIER));	
										
		PlayGround.getInstance().setElement(SoldierStatus.START_SOLDIER_ROW_POSITION, SoldierStatus.START_SNIPER_COL_POSITION, 
											new SoldierSniper(SoldierStatus.START_SOLDIER_ROW_POSITION, 
															  SoldierStatus.START_SNIPER_COL_POSITION, 
															  SoldierStatus.IS_SOLDIER_LIFE, 
															  SoldierStatus.IS_NOT_MAIN_SOLDIER));
											
		PlayGround.getInstance().setElement(SoldierStatus.START_SOLDIER_ROW_POSITION, SoldierStatus.START_SPY_COL_POSITION, 
											new SoldierSpy(SoldierStatus.START_SOLDIER_ROW_POSITION, 
														   SoldierStatus.START_SPY_COL_POSITION, 
														   SoldierStatus.IS_SOLDIER_LIFE, 
														   SoldierStatus.IS_NOT_MAIN_SOLDIER));
																								
		PlayGround.getInstance().setElement(SoldierStatus.START_SOLDIER_ROW_POSITION, SoldierStatus.START_WRECKER_COL_POSITION, 
											new SoldierWrecker(SoldierStatus.START_SOLDIER_ROW_POSITION, 
															   SoldierStatus.START_WRECKER_COL_POSITION, 
															   SoldierStatus.IS_SOLDIER_LIFE, 
															   SoldierStatus.IS_NOT_MAIN_SOLDIER));	
	}	
	
	public void processActionMove(String actionKey) {
		
		squadCollection.add((Squad) PlayGround.getInstance().getTankElement());
		squadCollection.add((Squad) PlayGround.getInstance().getSniperElement());
		squadCollection.add((Squad) PlayGround.getInstance().getSpyElement());
		squadCollection.add((Squad) PlayGround.getInstance().getWreckerElement());	
		
		int mainSoldierRow = squadCollection.get(0).getRow();
		int mainSoldierCol = squadCollection.get(0).getCol();
		
		int secondSoldierRow = squadCollection.get(1).getRow();
		int secondSoldierCol = squadCollection.get(1).getCol();
		
		int thirdSoldierRow = squadCollection.get(2).getRow();
		int thirdSoldierCol = squadCollection.get(2).getCol();
		
		int fourthSoldierRow = squadCollection.get(3).getRow();
		int fourthSoldierCol = squadCollection.get(3).getCol();
		
		
		if((actionKey.equals(KeyManager.FORWARD)) || (actionKey.equals(KeyManager.BACKWARD))) {
					
						int mainSoldierRowMultiplier = getDestinationRow(actionKey);
						
						squadCollection.get(0).setRow(mainSoldierRow + mainSoldierRowMultiplier);
						squadCollection.get(0).setCol(mainSoldierCol);
						
						squadCollection.get(1).setRow(mainSoldierRow);
						squadCollection.get(1).setCol(mainSoldierCol);
						
						squadCollection.get(2).setRow(secondSoldierRow);
						squadCollection.get(2).setCol(secondSoldierCol);
						
						squadCollection.get(3).setRow(thirdSoldierRow);
						squadCollection.get(3).setCol(thirdSoldierCol);
						
						PlayGround.getInstance().setElement((mainSoldierRow + mainSoldierRowMultiplier), mainSoldierCol, squadCollection.get(0));						
						PlayGround.getInstance().setElement(mainSoldierRow, mainSoldierCol, squadCollection.get(1));						
						PlayGround.getInstance().setElement(secondSoldierRow, secondSoldierCol, squadCollection.get(2));						
						PlayGround.getInstance().setElement(thirdSoldierRow, thirdSoldierCol, squadCollection.get(3));																
						transformToSurface(fourthSoldierRow, fourthSoldierCol);
																															
		}
		
		if((actionKey.equals(KeyManager.LEFT)) || (actionKey.equals(KeyManager.RIGHT))) {
							
						int mainSoldierColMultiplier = getDestinationCol(actionKey);
						
						squadCollection.get(0).setRow(mainSoldierRow);
						squadCollection.get(0).setCol(mainSoldierCol + mainSoldierColMultiplier);
						
						squadCollection.get(1).setRow(mainSoldierRow);
						squadCollection.get(1).setCol(mainSoldierCol);
						
						squadCollection.get(2).setRow(secondSoldierRow);
						squadCollection.get(2).setCol(secondSoldierCol);
						
						squadCollection.get(3).setRow(thirdSoldierRow);
						squadCollection.get(3).setCol(thirdSoldierCol);
						
						PlayGround.getInstance().setElement(mainSoldierRow, (mainSoldierCol + mainSoldierColMultiplier), squadCollection.get(0));					
						PlayGround.getInstance().setElement(mainSoldierRow, mainSoldierCol, squadCollection.get(1));						
						PlayGround.getInstance().setElement(secondSoldierRow, secondSoldierCol, squadCollection.get(2));						
						PlayGround.getInstance().setElement(thirdSoldierRow, thirdSoldierCol, squadCollection.get(3));						
						transformToSurface(fourthSoldierRow, fourthSoldierCol);																	
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
	
	private void setSoldierLine(int ChoosenMainSoldier) {
		
		Squad TankSoldier = (Squad) PlayGround.getInstance().getTankElement();
		Squad SniperSoldier = (Squad) PlayGround.getInstance().getSniperElement();
		Squad SpySoldier = (Squad) PlayGround.getInstance().getSpyElement();
		Squad WreckerSoldier = (Squad) PlayGround.getInstance().getWreckerElement();
		
		Squad currentMainSoldier = squadCollection.get(0);
		int currentMainSoldierRow = currentMainSoldier.getRow();
		int currentMainSoldierCol = currentMainSoldier.getCol();		

			if(ChoosenMainSoldier == 1) {
		
			}
			
			if(ChoosenMainSoldier == 2) {
				int sniperSoldierRow = SniperSoldier.getRow();
				int sniperSoldierCol = SniperSoldier.getCol();
				
				PlayGround.getInstance().setElement(currentMainSoldierRow, currentMainSoldierCol, 
						new SoldierSniper(currentMainSoldierRow, currentMainSoldierCol, true, 
								SoldierStatus.IS_MAIN_SOLDIER));
				
				currentMainSoldier.seIsPositionMain(false);
				currentMainSoldier.setRow(sniperSoldierRow);
				currentMainSoldier.setCol(sniperSoldierCol);

				PlayGround.getInstance().setElement(sniperSoldierRow, sniperSoldierCol, currentMainSoldier);				
			}
			
			if(ChoosenMainSoldier == 3) {
				
			}
			
			if(ChoosenMainSoldier == 4) {
				
			}
	}
	
	
}
