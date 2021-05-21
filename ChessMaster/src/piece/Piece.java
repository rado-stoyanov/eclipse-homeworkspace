package piece;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Piece {
	
	protected int row;
	protected int col;	
	protected Color color;
	protected int point;
	
	public Piece(int row, int col, Color color, int point) {
		this.row = row;
		this.col = col;
		this.color = color;
		this.point = point;
	}
	
	public abstract boolean isMovePosible(int toRow, int toCol);
	
	public abstract boolean isAttackPosible(int toRow, int toCol);
	
	public abstract void render(Graphics g);
	
	public abstract int getScore();

}
