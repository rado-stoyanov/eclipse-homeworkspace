package piece;

import java.awt.Color;
import java.awt.Graphics;

public class Pawn extends Piece {
	
	private int size = 50;
	
	public Pawn(int row, int col, Color color) {
		super(row, col, color, PieceScore.PAWN);	
	}

	@Override
	public int getScore() {
		
		return 1;
	}

	@Override
	public boolean isMovePosible(int toRow, int toCol) {
		
		int rowCoefficient = Math.abs(toRow- this.row);
		int colCoeficient = Math.abs(toCol - this.col);
		
		return rowCoefficient == 1 && colCoeficient == 0;
	}

	@Override
	public boolean isAttackPosible(int toRow, int toCol) {
		
		int rowCoefficient = Math.abs(toRow- this.row);
		int colCoeficient = Math.abs(toCol - this.col);
		
		return rowCoefficient == 1 && colCoeficient == 1;
	}

	@Override
	public void render(Graphics g) {
		
		int tileX = this.col * this.size;
		int tileY = this.row * this.size;
		
		g.setColor(this.color);
		g.fillOval(tileX, tileY, this.size, this.size);
		
	}
	
	
	
	
}
