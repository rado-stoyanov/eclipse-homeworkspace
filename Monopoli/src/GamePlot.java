import java.util.Random;

public class GamePlot {
	
	private static final int GAME_PLOT_LENGHT 	= 20;
			
	private static final String START 			= "|START|";	
	private static final String TRAP 			= "|T|";
	private static final String INVEST 			= "|I|";
	private static final String PARTY_HARD 		= "|P|";
	private static final String CHANCE 			= "|C|";
	private static final String STEAL 			= "|S|";
	
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
	
	public static String[] GamePlot = new String[GAME_PLOT_LENGHT];
		
	
	public static void renderGamePlot() {		
		addElementsToGamePlot();
			
		for(int i = 0 ; i <= 7 ; i++) {
			System.out.print(GamePlot[i]);			
		}	
		System.out.print("\n" + GamePlot[19]);
		System.out.print("                  ");
		System.out.print(GamePlot[8]);		
		System.out.print("\n" + GamePlot[18]);
		System.out.print("                  ");
		System.out.print(GamePlot[9] + "\n");		
		for(int j = 17 ; j > 9 ; j--) {
			System.out.print(GamePlot[j]);			
		}		
	}
	
	
	private static void addElementsToGamePlot() { 
		for(int i = 0 ; i < GAME_PLOT_LENGHT ; i++) { 						
			if(i == 10) {
				GamePlot[10] = START;
			}
			else {
				GamePlot[i] = choosenElementForAdding();
			}		
		}
	}
		
	
	private static String choosenElementForAdding() {		
		Random index = new Random();	
		int newElementIndex = index.nextInt(PLOT_ELEMENTS);

		if(newElementIndex == TRAP_INDEX) {
			if(trapElements != 0) {
				newElement = TRAP;
				trapElements--;
			}else {
				choosenElementForAdding();
			}
		}	
		else if(newElementIndex == INVEST_INDEX) {
			if(investElements != 0) {
				newElement = INVEST;
				investElements--;
			}else {
				choosenElementForAdding();
			}
		}		
		else if(newElementIndex == PARTY_HARD_INDEX) {
			if(partyHardElements != 0) {
				newElement = PARTY_HARD;
				partyHardElements--;
			}else {
				choosenElementForAdding();
			}
		}	
		else if(newElementIndex == CHANCE_INDEX) {
			if(chanceElements != 0) {
				newElement = CHANCE;
				chanceElements--;
			}else {
				choosenElementForAdding();
			}
		}		
		else if(newElementIndex == STEAL_INDEX) {
			if(stealElements != 0) {
				newElement = STEAL;
				stealElements--;
			}else {
				choosenElementForAdding();
			}		
		}		
		return newElement;
	}
	
	
	
	
		

	
	
	
	
	

}
