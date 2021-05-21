import java.util.Random;
import elements.Chance;
import elements.Invest;
import elements.PartyHard;
import elements.Start;
import elements.Steal;
import elements.Trap;

public class GamePlotManager {
	
	private static final int TRAP_INDEX 		= 0;
	private static final int INVEST_INDEX 		= 1;
	private static final int PARTY_HARD_INDEX 	= 2;
	private static final int CHANCE_INDEX 		= 3;
	private static final int STEAL_INDEX 		= 4;
		
	private static final int PLOT_ELEMENTS 		= 5;
	
	private static int trapElements 			= 7;
	private static int investElements 			= 3;
	private static int partyHardElements 		= 3;
	private static int chanceElements 			= 3;
	private static int stealElements 			= 3;
	
	private static String newElement;
	
	public static void addElementsToGamePlot() { 
		Start start = new Start();
		
		for(int i = 0 ; i < GamePlot.GAME_PLOT_LENGHT ; i++) { 	
			if(i == 10) {					
				GamePlot.GamePlot[10] = start.getGameType();		
			}
			else {
				GamePlot.GamePlot[i] = choosenElementForAdding();			
			}		
		}
		GamePlot.GamePlotMirror.equals(GamePlot.GamePlot);
	}
	

	public static void movePlayerElement(int lastPosition, int playerIndex, Object playerSymbol) { 	
		GamePlot.GamePlot[playerIndex] = playerSymbol;
		GamePlot.GamePlot[lastPosition] = GamePlot.GamePlotMirror[lastPosition];
	}
		
	
	private static String choosenElementForAdding() {	
		Trap trap = new Trap();
		Invest invest = new Invest();
		Chance chance = new Chance();
		Steal steal = new Steal();
		PartyHard party = new PartyHard();
		
		Random index = new Random();	
		int newElementIndex = index.nextInt(PLOT_ELEMENTS);

		if(newElementIndex == TRAP_INDEX) {
			if(trapElements != 0) {
				newElement = trap.getGameType();
				trapElements--;
			}else {
				choosenElementForAdding();
			}
		}	
		else if(newElementIndex == INVEST_INDEX) {
			if(investElements != 0) {
				newElement = invest.getGameType();
				investElements--;
			}else {
				choosenElementForAdding();
			}
		}		
		else if(newElementIndex == PARTY_HARD_INDEX) {
			if(partyHardElements != 0) {
				newElement = party.getGameType();
				partyHardElements--;
			}else {
				choosenElementForAdding();
			}
		}	
		else if(newElementIndex == CHANCE_INDEX) {
			if(chanceElements != 0) {
				newElement = chance.getGameType();
				chanceElements--;
			}else {
				choosenElementForAdding();
			}
		}		
		else if(newElementIndex == STEAL_INDEX) {
			if(stealElements != 0) {
				newElement = steal.getGameType();
				stealElements--;
			}else {
				choosenElementForAdding();
			}		
		}		
		return newElement;
	}

}
