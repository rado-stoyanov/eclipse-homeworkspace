import java.util.Random;

public class Application {
	
	private static final int GAME_PLOT_ROWS = 4;
	private static final int GAME_PLOT_COLS = 8;
	
	private static final int FIRST_RAW = 0;	
	private static final int LAST_RAW = GAME_PLOT_ROWS - 1; 
	private static final int FIRST_COL = 0;
	private static final int LAST_COL = GAME_PLOT_COLS - 1;
	
	private static final String ELEMENT_BORDER = "|";
			
	private static final String START = "|START|";
	private static final String OUT_OF_GAME_BORDER = "   ";
	
	private static final char TRAP = 'T';
	private static final char INVEST = 'I';
	private static final char PARTY_HARD = 'P';
	private static final char CHANCE = 'C';
	private static final char STEAL = 'S';
	
	private static int trapElements = 7;
	private static int investElements = 3;
	private static int partyHardElements = 3;
	private static int chanceElements = 3;
	private static int stealElements = 3;
	
	private static String newElement;
	
	private static String[][] GamePlot = new String[GAME_PLOT_ROWS][GAME_PLOT_COLS];
	
		
	private static void addElementsToGamePlot() { 
		for(int row = 0 ; row < GAME_PLOT_ROWS ; row++) { 
			for(int col = 0 ; col < GAME_PLOT_COLS ; col++) { 
				
				if(row == LAST_RAW && col == LAST_COL) {
					GamePlot[row][col] = START;
				}				
				else if((row != FIRST_RAW || row != LAST_RAW) && (col == FIRST_COL || col == LAST_COL)) {
					GamePlot[row][col] = choosenElementForAdding();		
				}		
				else if (row == FIRST_RAW || row == LAST_RAW) {
					GamePlot[row][col] = choosenElementForAdding();
				}
				else if((row != FIRST_RAW || row != LAST_RAW) && (col != FIRST_COL || col != LAST_COL)) {
					GamePlot[row][col] = OUT_OF_GAME_BORDER;		
				}					
			}
		}
	}
	
	
	private static String choosenElementForAdding() {
		
		Random index = new Random();	
		int newElementIndex = index.nextInt(5);

		if(newElementIndex == 0) {
			if(trapElements != 0) {
				newElement = ELEMENT_BORDER + TRAP + ELEMENT_BORDER;
				trapElements--;
			}else {
				choosenElementForAdding();
			}
		}
		else if(newElementIndex == 1) {
			if(investElements != 0) {
				newElement = ELEMENT_BORDER + INVEST + ELEMENT_BORDER;
				investElements--;
			}else {
				choosenElementForAdding();
			}
		}
		else if(newElementIndex == 2) {
			if(partyHardElements != 0) {
				newElement = ELEMENT_BORDER + PARTY_HARD + ELEMENT_BORDER;
				partyHardElements--;
			}else {
				choosenElementForAdding();
			}
		}
		else if(newElementIndex == 3) {
			if(chanceElements != 0) {
				newElement = ELEMENT_BORDER + CHANCE + ELEMENT_BORDER;
				chanceElements--;
			}else {
				choosenElementForAdding();
			}
		}
		else if(newElementIndex == 4) {
			if(stealElements != 0) {
				newElement = ELEMENT_BORDER + STEAL + ELEMENT_BORDER;
				stealElements--;
			}else {
				choosenElementForAdding();
			}		
		}		
		return newElement;
	}
	
	
//	private static String choosenElementForAdding() {
//		
//		Random index = new Random();	
//		int newElementIndex = index.nextInt(5);
//
//		
//		switch(newElementIndex) {
//			case 0:
//				if(trapElements != 0) {
//					newElement = ELEMENT_BORDER + TRAP + ELEMENT_BORDER;
//					trapElements--;
//					break;
//				}else {
//					choosenElementForAdding();
//				}				
//			case 1:
//				if(investElements != 0) {
//					newElement = ELEMENT_BORDER + INVEST + ELEMENT_BORDER;
//					investElements--;
//					break;
//				}else {
//					choosenElementForAdding();
//				}				
//			case 2:
//				if(partyHardElements != 0) {
//					newElement = ELEMENT_BORDER + PARTY_HARD + ELEMENT_BORDER;
//					partyHardElements--;
//					break;
//				}else {
//					choosenElementForAdding();
//				}				
//			case 3:
//				if(chanceElements != 0) {
//					newElement = ELEMENT_BORDER + CHANCE + ELEMENT_BORDER;
//					chanceElements--;
//					break;
//				}else {
//					choosenElementForAdding();
//				}			
//			case 4:
//				if(stealElements != 0) {
//					newElement = ELEMENT_BORDER + STEAL + ELEMENT_BORDER;
//					stealElements--;
//					break;
//				}else {
//					choosenElementForAdding();
//				}					
//		}
//		return newElement;
//	}
		
	
	private static void renderGamingPlot() {
		for(int row = 0 ; row < GAME_PLOT_ROWS ; row++) {
			for(int col = 0 ; col < GAME_PLOT_COLS ; col++) {
				if(col == (GAME_PLOT_COLS-1)) {
					System.out.println(GamePlot[row][col]);
				}else {
					System.out.print(GamePlot[row][col]);
				}			
			}
		}
	}
	

	public static void main(String[] args) {
			
		addElementsToGamePlot();
		renderGamingPlot();
		

		

		
		
		
		
		
		
		
		
		
		
	}
}
