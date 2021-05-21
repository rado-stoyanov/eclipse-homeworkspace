import java.util.ArrayList;

public class PlayerManager {
	
	private static int startPosition 					= 10;
	private static final int ALL_BOARD_POSITIONS 		= 20;
	private static int currentPosition 					= startPosition;		

	public static ArrayList<Player> allPlayers = new ArrayList<Player>();
	
	private static String playerName 					= "Радостин";
	private static int startMoney 						= 1000;
	
	
	
	public static void createNewPlayer() {
		Player firstPlayer = new Player(playerName, startMoney, GamePlot.GamePlot[currentPosition], currentPosition);
		allPlayers.add(firstPlayer);
	}
	
	public static void playersList() {
		for(Player element : allPlayers) {
			if(element != null) {
				element.renderPlayer();
			}
		}
	}
		
	public static void getPlayerPosition() {
		int dice = Dice.roll();
		int nextCurrentPosition = currentPosition + dice;	
		
		if(nextCurrentPosition >= ALL_BOARD_POSITIONS) {
			currentPosition = currentPosition + dice - ALL_BOARD_POSITIONS;
		}else {
			currentPosition += dice;	
		}
		allPlayers.get(0).setPosition(GamePlot.GamePlot[currentPosition]);
		allPlayers.get(0).setIndexPosition(currentPosition);
	}

}
