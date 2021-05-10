package buildingwar;

import buildingwar.manager.PlayGroundManager;

public class Application {

	public static void main(String[] args) {
		
		PlayGroundManager newGame = new PlayGroundManager();
		newGame.start();

	}

}
