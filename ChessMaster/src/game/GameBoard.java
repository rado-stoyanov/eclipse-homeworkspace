package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import piece.Piece;
import piece.Tile;

public class GameBoard extends JFrame{
	
	
	private final int GAME_BOARD_ROW_COUNT = 8;
	private final int GAME_BOARD_COL_COUNT = 8;
	
	private Piece[][] gameBoard;

	public GameBoard() {		
		this.setVisible(true);
		this.setSize(640, 640);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}
	
	
	public void bootstrap() {
		
		this.gameBoard = new Piece[GAME_BOARD_ROW_COUNT][GAME_BOARD_COL_COUNT];
		
		for( int row = 0; row < GAME_BOARD_ROW_COUNT; row++) {
			for(int col = 0; col < GAME_BOARD_COL_COUNT; col++) {
				
				Color tileCilor = getTileColor(row, col);	
				this.gameBoard[row][col] = new Tile(row, col, tileColor);
				
				(new Tile(row, col, tileCilor)).render(g);
			}
		}	
	}
	

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		this.paintGameBoardTileCollection(g);
	}	
	
	
	private Color getTileColor(int row, int col) {
		
		boolean isRowColEven = (row % 2 == 0) && (col % 2 == 0);
		boolean isRowColOdd = (row % 2 != 0) && (col % 2 != 0);
		
		if(isRowColEven || isRowColOdd) {
			return Color.BLACK;
		}
		return Color.WHITE;		
	}
	
	private void paintGameBoardTileCollection(Graphics g) {
		

	}
	
	
}
