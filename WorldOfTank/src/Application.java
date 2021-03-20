import java.util.Random;

public class Application {
	
	private static final int GAME_BOARD_SIZE = 10;

	private static final char PASSABLE_TEREN 		= '.';
	private static final char ENEMY_NORMAL_TANK 	= '$';
	private static final char ENEMY_LEADER 			= '^';
	private static final char BREAKABLE_BARAKADE 	= '*';
	private static final char UNBREAKABLE_BARAKADE 	= '#';
	private static final char PLAYER 				= '%';
	private static final char HQ 					= '&';
	private static final char POWERUP_ARMOR 		= '?';
	private static final char POWERUP_BULLET 		= '@';
	
	private static char[][] gameBoard = new char[GAME_BOARD_SIZE][GAME_BOARD_SIZE]; //Deklarirane na matrica [redove] [koloni]
	
	private static void generateTerren() {	
		for( int row = 0 ; row < GAME_BOARD_SIZE ; row++) {
			for(int col = 0 ; col < GAME_BOARD_SIZE ; col++) {
				gameBoard[row][col] = PASSABLE_TEREN;
			}
		}
	}
	
	private static boolean isBarikadeProcessable() {	
		Random randomGenerator = new Random();
		int processableCoeficient = randomGenerator.nextInt(11);	
		return (processableCoeficient < 8 && processableCoeficient > 1);

	}
	
	private static void generateBarikade() {
		for( int row = 1 ; row < (GAME_BOARD_SIZE-1) ; row++) {
			for(int col = 0 ; col < GAME_BOARD_SIZE ; col++) {
				
				if(isBarikadeProcessable()) {
					gameBoard[row][col] = PASSABLE_TEREN;
				}
				
			}
		}
	}

	
	private static void generateGameBoard() {
		//1.Insert PASSABLE_TEREN
		generateTerren();
		
		//2. Insert HQ
		

		
		
	}
	
	
	private static void renderGameBoard() {
		
		for( int row = 0 ; row < GAME_BOARD_SIZE ; row++) {
			for(int col = 0 ; col < GAME_BOARD_SIZE ; col++) {
				System.out.print(gameBoard[row][col]);
			}
			System.out.println(" ");
		}	
	}

	public static void main(String[] args) {
		
		//int[][][] matrixRow = new int[10][10][10]; //Modelirane na tri izmerno prostranstvo
		
		generateGameBoard();
		renderGameBoard();
		
		

	}

}
