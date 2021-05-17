package buildingwar.manager;

import buildingwar.playground.PlayGround;
import buildingwar.util.Console;

public class ApplicationManager {
	
	public void start() {
		PlayGroundManager newPlayGound = new PlayGroundManager();
		newPlayGound.bootstrap();
		
		BuildingManager newBuidings = new BuildingManager();
		newBuidings.boostrap();
		
		SquadManager newSquad = new SquadManager();
		newSquad.boostrap();
		
		this.render();
		
		loadGamePlay();
	
	}
	
		
	private void render() {
		PlayGround.getInstance().render();
	}
	
	
	private void loadGamePlay() {
		
		String actionKey = Console.promtString("Choose squad direction: ");
		if(KeyManager.isDirectionKey(actionKey)) {
			new SquadManager().processActionMove(actionKey);
		}
		
		Console.logln("");
		Console.logln("");
		this.render();
		loadGamePlay();
	}
	
	
	

}
