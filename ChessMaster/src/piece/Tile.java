package piece;

import java.awt.Color;
import java.awt.Graphics;

public class Tile {
	
	private int row;
	private int col;
	private int size;
	private Color color;
	
	public Tile(int row, int col, Color color) {
		this.row 	= row;
		this.col 	= col;
		this.size 	= 80;
		this.color = color;
	}
	
	public void render(Graphics g) {
		
		int tileX = this.col * this.size;
		int tileY = this.row * this.size;
		
		g.setColor(this.color);
		g.fillRect(tileX, tileY, this.size, this.size);
		
	
	
	}

}
