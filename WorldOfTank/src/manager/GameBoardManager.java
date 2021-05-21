package manager;

import model.RowCol;
import units.child.PlayerTank;
import units.child.Terren;
import units.parent.Unit;
import util.Console;

public class GameBoardManager {
	
	private final int GAME_BOARD_SIZE = 10;
	private final int GAME_BOARD_FIRST_ROW = 0;
	private final int GAME_BOARD_LAST_ROW;
	private Unit[][] gameBoard;
	
	private PlayerTank playerReference;
	
	public GameBoardManager() {
		this.gameBoard = new Unit[GAME_BOARD_SIZE][GAME_BOARD_SIZE];
		this.GAME_BOARD_LAST_ROW = GAME_BOARD_SIZE - 1;
	}
	
	public void start(String dificulty) {
		this.bootstrap(dificulty);
		this.render();
		this.startMainGame();
		
	}
	
	private void startMainGame() {		
		String actionKey = Console.input("Please enter action: ");
		if(GameKeyManager.isDirectionKey(actionKey)) {
			processActionMove(actionKey);
		}
		
		if(GameKeyManager.isFireKey(actionKey)) {
			processActionFire();
		}
		
		this.render();
		this.startMainGame();		
	}
	
	private void render() {		
		for(int row = 0 ; row < this.GAME_BOARD_SIZE ; row++) {
			for(int col = 0 ; col < this.GAME_BOARD_SIZE ; col ++) {
				Console.log(this.getGameBoardElement(row, col).getSymbol());
			}
			Console.lognl("");
		}		
	}
	
	private void bootstrap(String dificulty) {
		Level level = LevelManager.bootstrap(dificulty);
		this.gameBoard = level.bootstrap();
		this.playerReference = (PlayerTank) level.getPlayer();
	}
	
	private void processActionFire() {
		String directionKey = Console.input("Please enter direction: ");
		
		if(GameKeyManager.isDirectionForward(directionKey)) {
			
			int row = this.playerReference.getRow() - 1;
			int col = this.playerReference.getCol();
			for(; row >= 0 ; row--) {
				if(this.getGameBoardElement(row, col).isBreakble()) {
					this.processHit(new RowCol(row, col));
					return;
				}
			}
		}
		
		if(GameKeyManager.isDirectionBackward(directionKey)) {
			int row = this.playerReference.getRow() + 1;
			int col = this.playerReference.getCol();
			for(; row < GAME_BOARD_SIZE; row++) {
				if(this.getGameBoardElement(row, col).isBreakble()) {
					this.processHit(new RowCol(row, col));
					return;
				}
			}
		}
		
		if(GameKeyManager.isDirectionLeft(directionKey)) {
			int row = this.playerReference.getRow();
			int col = this.playerReference.getCol() - 1;
			for(; col >= 0; col--) {
				if(this.getGameBoardElement(row, col).isBreakble()) {
					this.processHit(new RowCol(row, col));
					return;
				}
			}
		}
		
		if(GameKeyManager.isDirectionRight(directionKey)) {
			int row = this.playerReference.getRow();
			int col = this.playerReference.getCol() + 1;
			for(; col >= 0; col++) {
				if(this.getGameBoardElement(row, col).isBreakble()) {
					this.processHit(new RowCol(row, col));
					return;
				}
			}
		}	
	}
	
	private void processActionMove(String actionKey) {
		RowCol destination = this.playerReference.getDestination(actionKey);
		if(this.isMoveValid(destination)) {
			this.transformToTerren(this.playerReference.getRowCol());
			this.setGameBoardElement(destination, this.playerReference);
			this.playerReference.move(destination);
		}
	}
	
	private void processHit(RowCol coordinates) {
		this.transformToTerren(coordinates);
	}
	
	private void transformToTerren(RowCol coordinates) {
		Unit emptySpace = new Terren(coordinates);
		this.setGameBoardElement(coordinates, emptySpace);
	}
	
	private void setGameBoardElement(RowCol coordinates, Unit element) {
		this.gameBoard[coordinates.getRow()][coordinates.getCol()] = element;
	}
	
	private void setGameBoardElement(int row, int col, Unit element) {
		this.gameBoard[row][col] = element;
	}
	
	private Unit getGameBoardElement(RowCol coordinates) {
		return this.gameBoard[coordinates.getRow()][coordinates.getCol()];
	}
	
	private Unit getGameBoardElement(int row, int col) {
		return this.gameBoard[row][col];
	}
	
	private boolean isMoveValid(RowCol destination) {
		
		try {
			Unit element = this.getGameBoardElement(destination);
			return element.isPassable();
		}
		catch(Exception e) {
			return false;
		}		
	}

}
