import java.util.ArrayList;
import java.util.Random;

public class Application {
	
	
	private static int startPosition = 10;
	private static final int ALL_BOARD_POSITIONS = 20;
	private static int currentPosition = startPosition;	
	
	//Player Data
	private static String playerName = "Радостин";
	private static int startMoney = 1000;
	
	//Array with Players
	public static ArrayList<Player> allPlayers = new ArrayList<Player>();
	
	
	public static void createNewPlayer() {
		Player firstPlayer = new Player(playerName, startMoney, GamePlot.GamePlot[currentPosition]);
		allPlayers.add(firstPlayer);
	}
	
		
	public static void renderPlayers() {
		for(Player element : allPlayers) {
			if(element != null) {
				element.renderPlayer();
			}
		}
	}
	
		
	public static int rollTheDice() {
		Random random = new Random();
		int diceNumber = random.nextInt(2);
		return diceNumber + 1;
	}
	
	
	
	
	public static void getPlayerPosition() {
		int dice = rollTheDice();
		int nextCurrentPosition = currentPosition + dice;	
		
		if(nextCurrentPosition >= ALL_BOARD_POSITIONS) {
			currentPosition = currentPosition + dice - ALL_BOARD_POSITIONS;
		}else {
			currentPosition += dice;	
		}
		
		allPlayers.get(0).setPosition(GamePlot.GamePlot[currentPosition]);
	}
	
	

	
	public static void main(String[] args) {
			
		GamePlot.renderGamePlot();		
		createNewPlayer();	
		
		System.out.println("\n");
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
		
		getPlayerPosition();
		renderPlayers();
	
	}
}
