import java.util.Random;

public class Application {

	private static final int GAME_BOARD_SIZE	 	= 10;
	private static final int GAME_BOARD_FIRST_ROW 	= 0;
	private static final int GAME_BOARD_LAST_ROW 	= (GAME_BOARD_SIZE - 1);
	
	private static final char PASSABLE_TEREN 		= '.';
	private static final char BREAKABLE_BARIKADE 	= '*';
	private static final char UNBREAKABLE_BARIKADE 	= '#';
	private static final char ENEMY_NORMAL_TANK 	= '$';
	private static final char ENEMY_LIDER_TANK 		= '^';
	private static final char PLAYER 				= '%';
	private static final char HQ 					= '&';
	private static final char POWERUP_ARMOR 		= '?';
	private static final char POWERUP_BULET 		= '@';
	
	private static char[][] gameBoard = new char[GAME_BOARD_SIZE][GAME_BOARD_SIZE];
		
	private static void generateTeren() {

		for(int row = 0; row < GAME_BOARD_SIZE; row++) {
			for(int col = 0; col < GAME_BOARD_SIZE; col++) {
				gameBoard[row][col] = PASSABLE_TEREN;
			}
		}		
	}
	
	private static boolean isBarikadeProcessable() {
		
		Random randomGenerator 		= new Random();
		int processableCoeficient 	= randomGenerator.nextInt(11);
		
		return !(processableCoeficient < 8 && 
			   processableCoeficient > 1);
	}
	
	private static char selectBarikade() {
		
		Random randomGenerator 		= new Random();
		int processableCoeficient 	= randomGenerator.nextInt(11);
		
		return (processableCoeficient % 2 == 0) 
				? BREAKABLE_BARIKADE
				: UNBREAKABLE_BARIKADE;
	}
	
	private static void generateBarikade() {

		final int START_ROW_BARIKADE_ZONE 	= 3; 
		final int END_ROW_BARIKADE_ZONE 	= (GAME_BOARD_SIZE - 3);
		
		
		for(int row = START_ROW_BARIKADE_ZONE; row < END_ROW_BARIKADE_ZONE; row++) {
			for(int col = 0; col < GAME_BOARD_SIZE; col++) {
				
				if(isBarikadeProcessable()) {
					gameBoard[row][col] = selectBarikade();	
				}
			}
		}
	}
	
	private static void generateHq() {
		
		Random randomGenerator 	= new Random();
		int positionIndex 		= randomGenerator.nextInt(10);
		gameBoard[GAME_BOARD_LAST_ROW][positionIndex] = HQ;	
	}
	
	private static void generatePlayer() {
		
		Random randomGenerator 	= new Random();
		int positionIndex 		= randomGenerator.nextInt(10);
		
		if(gameBoard[GAME_BOARD_LAST_ROW][positionIndex] == PASSABLE_TEREN) {
			gameBoard[GAME_BOARD_LAST_ROW][positionIndex] = PLAYER;	
		}
		else {
			generatePlayer();
		}
	}	
	
	private static char selectEnemyTank() {
		
		Random randomGenerator 		= new Random();
		int processableCoeficient 	= randomGenerator.nextInt(11);
		
		return (processableCoeficient % 2 == 0) 
				? ENEMY_NORMAL_TANK
				: ENEMY_LIDER_TANK;		
	}
	
	private static void generateEnemyTank() {

		Random randomGenerator 	= new Random();
		int positionIndex 		= randomGenerator.nextInt(10);
		
		if(gameBoard[GAME_BOARD_FIRST_ROW][positionIndex] == PASSABLE_TEREN) {
			gameBoard[GAME_BOARD_FIRST_ROW][positionIndex] = selectEnemyTank();	
		}
		else {
			generateEnemyTank();
		}
	}
	
	private static void generateGameBoard() {
		
		// 1. Insert X 
		generateTeren();
		
		// 2. Insert Barikade
		generateBarikade();
		
		// 3. Insert HQ
		generateHq();
		
		// 4. Insert player
		generatePlayer();
		
		// 5. Insert enemy
		generateEnemyTank();
		generateEnemyTank();
		generateEnemyTank();
	}
	
	private static void renderGameBoard() {
		
		for(int row = 0; row < GAME_BOARD_SIZE; row++) {
			for(int col = 0; col < GAME_BOARD_SIZE; col++) {
				System.out.print(gameBoard[row][col]);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		generateGameBoard();
		renderGameBoard();
	}
}