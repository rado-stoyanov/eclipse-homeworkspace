package board;

import units.parent.Unit;

public class GameBoard implements GameBoardInterface {
	
	private Unit[][] gameBoard;
	
	public GameBoard(int rowCount, int colCount) {
		this.gameBoard = new Unit[rowCount][colCount];
	}
	
	@Override
	public Unit getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}
}
