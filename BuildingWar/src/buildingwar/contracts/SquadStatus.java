package buildingwar.contracts;

public interface SquadStatus {
	
	final int START_SOLDIER_ROW_POSITION 	= 14;
	final int START_TANK_COL_POSITION 		= 11;
	final int START_SNIPER_COL_POSITION 	= 12;
	final int START_SPY_COL_POSITION 		= 13;
	final int START_WRECKER_COL_POSITION 	= 14;
	
	final boolean IS_MAIN_SOLDIER 			= true;
	final boolean IS_NOT_MAIN_SOLDIER 		= false;
	
	final boolean IS_SOLDIER_LIFE 			= true;
	final boolean IS_SOLDIER_NOT_LIFE 		= false;
	
	final int SQUAD_COUNT_INDEX 			= 4;
	

}
