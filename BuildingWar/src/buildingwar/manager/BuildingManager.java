package buildingwar.manager;

import buildingwar.buildings.child.BigBuilding;
import buildingwar.buildings.child.MediumBuilding;
import buildingwar.buildings.child.SmallBuilding;
import buildingwar.util.Generate;

public class BuildingManager {
	
	boolean isFirstQuadrantFull = false;
	boolean isSecondQuadrantFull = false;
	boolean isThirdQuadrantFull = false;
	
	boolean isSmallBuildUsed = false;
	boolean isMediumBuildUsed = false;
	boolean isBigBuildUsed = false;
	
		
	public void boostrap() {
		this.BuildingStructureOnGround();
	}
	
	
	private void BuildingStructureOnGround() {	
		
		
		if(this.isFirstQuadrantFull == true && this.isSecondQuadrantFull == true && this.isThirdQuadrantFull == true) {
			return;
		}
		else {
			for(int i = 0 ; i < 3; i++) {
				int choosenGroundQuadrant = Generate.random(3);
				
				if(choosenGroundQuadrant == 0 && this.isFirstQuadrantFull == false) {
					firstQuadrant();
				}
				if(choosenGroundQuadrant == 1 && this.isSecondQuadrantFull == false) {
					secondQuadrant();
				}
				if(choosenGroundQuadrant == 2 && this.isThirdQuadrantFull == false) {
					thirdQuadrant();
				}			
			}	
			BuildingStructureOnGround();
		}
		

	}	
	
	
	private void firstQuadrant() {
		
		final int firstQuadrantStartRow = 1;
		final int firstQuadrantEndRow = 6;
		
		final int firstQuadrantStartCol = 1;
		final int firstQuadrantEndCol = 5;
		
		int choosenBuilding = Generate.random(3);
		
		for(int row = firstQuadrantStartRow; row <= firstQuadrantEndRow; row++) {
			for(int col = firstQuadrantStartCol; col <= firstQuadrantEndCol; col++) {
						
				if(choosenBuilding == 0 && isSmallBuildUsed == false) {		
					if(row == 6 || col == 5) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(20);
					
					if(smallBuldingPosition >= 2 && smallBuldingPosition <= 14) {
						new SmallBuilding(row, col).createBuilding(row, col);
						isFirstQuadrantFull = true;
						isSmallBuildUsed = true;
						return;
					}	
				}
				
				if(choosenBuilding == 1 && isMediumBuildUsed == false) {
					if(row == 6 || col == 4 || col == 5) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(15);
					
					if(smallBuldingPosition >= 4 && smallBuldingPosition <= 12) {
						new MediumBuilding(row, col).createBuilding(row, col);
						isFirstQuadrantFull = true;
						isMediumBuildUsed = true;
						return;
					}
				}
				
				if(choosenBuilding == 2 && isBigBuildUsed == false) {
					if(row == 5 || row == 6 || col == 4 || col == 5) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(12);
					
					if(smallBuldingPosition >= 3 && smallBuldingPosition <= 10) {
						new BigBuilding(row, col).createBuilding(row, col);
						isFirstQuadrantFull = true;
						isBigBuildUsed = true;
						return;
					}
				}			
			}
		}	
	}
	
	
	private void secondQuadrant() {
		
		final int firstQuadrantStartRow = 1;
		final int firstQuadrantEndRow = 6;
		
		final int firstQuadrantStartCol = 9;
		final int firstQuadrantEndCol = 13;
		
		int choosenBuilding = Generate.random(3);
		
		for(int row = firstQuadrantStartRow; row <= firstQuadrantEndRow; row++) {
			for(int col = firstQuadrantStartCol; col <= firstQuadrantEndCol; col++) {
						
				if(choosenBuilding == 0 && isSmallBuildUsed == false) {		
					if(row == 6 || col == 13) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(20);
					
					if(smallBuldingPosition >= 2 && smallBuldingPosition <= 14) {
						new SmallBuilding(row, col).createBuilding(row, col);
						isSecondQuadrantFull = true;
						isSmallBuildUsed = true;
						return;
					}	
				}
				
				if(choosenBuilding == 1 && isMediumBuildUsed == false) {
					if(row == 6 || col == 12 || col == 13) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(15);
					
					if(smallBuldingPosition >= 4 && smallBuldingPosition <= 12) {
						new MediumBuilding(row, col).createBuilding(row, col);
						isSecondQuadrantFull = true;
						isMediumBuildUsed = true;
						return;
					}
				}
				
				if(choosenBuilding == 2 && isBigBuildUsed == false) {
					if(row == 5 || row == 6 || col == 12 || col == 13) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(12);
					
					if(smallBuldingPosition >= 3 && smallBuldingPosition <= 10) {
						new BigBuilding(row, col).createBuilding(row, col);
						isSecondQuadrantFull = true;
						isBigBuildUsed = true;
						return;
					}
				}			
			}
		}	
	}
	
	private void thirdQuadrant() {
		
		final int firstQuadrantStartRow = 9;
		final int firstQuadrantEndRow = 13;
		
		final int firstQuadrantStartCol = 1;
		final int firstQuadrantEndCol = 5;
		
		int choosenBuilding = Generate.random(3);
		
		for(int row = firstQuadrantStartRow; row <= firstQuadrantEndRow; row++) {
			for(int col = firstQuadrantStartCol; col <= firstQuadrantEndCol; col++) {
						
				if(choosenBuilding == 0 && isSmallBuildUsed == false) {		
					if(row == 13 || col == 5) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(16);
					
					if(smallBuldingPosition >= 4 && smallBuldingPosition <= 12) {
						new SmallBuilding(row, col).createBuilding(row, col);
						isThirdQuadrantFull = true;
						isSmallBuildUsed = true;
						return;
					}	
				}
				
				if(choosenBuilding == 1 && isMediumBuildUsed == false) {
					if(row == 13 || col == 4 || col == 5) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(12);
					
					if(smallBuldingPosition >= 4 && smallBuldingPosition <= 12) {
						new MediumBuilding(row, col).createBuilding(row, col);
						isThirdQuadrantFull = true;
						isMediumBuildUsed = true;
						return;
					}
				}
				
				if(choosenBuilding == 2 && isBigBuildUsed == false) {
					if(row == 12 || row == 13 || col == 4 || col == 5) {
						break;
					}
					
					int smallBuldingPosition = Generate.random(9);
					
					if(smallBuldingPosition >= 4 && smallBuldingPosition <= 8) {
						new BigBuilding(row, col).createBuilding(row, col);
						isThirdQuadrantFull = true;
						isBigBuildUsed = true;
						return;
					}
				}			
			}
		}	
	}
				
}
