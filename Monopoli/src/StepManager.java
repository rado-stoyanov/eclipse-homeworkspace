import java.util.Scanner;

public class StepManager {

		private static final String MOVING_KEY  = "m";
		private static int lastPosition = 0;
		private static Object lastPlayerSymbol;
		
		public static void move() {
			
			int PlayerIndexPosition = PlayerManager.allPlayers.get(0).getIndexPosition();
			Object PlayerSymbol = PlayerManager.allPlayers.get(0).PlayerSymbol;
			lastPlayerSymbol = GamePlot.GamePlot[lastPosition];
			
			if(PlayerIndexPosition != 10) {			
				GamePlotManager.movePlayerElement(lastPosition ,PlayerIndexPosition, PlayerSymbol);
			}
			
			
			PlayerManager.playersList();		
			GamePlot.renderGamePlot();
			
			System.out.println("Your turn. Press m to move: ");
			
			Scanner input = new Scanner(System.in);
			String key 	  = input.next();
			
			if(key.equals(MOVING_KEY)) {
				lastPosition = PlayerManager.allPlayers.get(0).getIndexPosition();
				PlayerManager.getPlayerPosition();	
				move();
			}
			else{
				move();
			}		
		}
		

}
