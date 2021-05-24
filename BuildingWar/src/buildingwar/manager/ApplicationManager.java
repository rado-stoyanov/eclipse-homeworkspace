package buildingwar.manager;

import buildingwar.contracts.GamePlayStatus;
import buildingwar.playground.PlayGroundoObject;
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
		PlayGroundoObject.getInstance().render();
	}
	
	
	private void loadGamePlay() {

		Console.logln("Action options:");
		Console.logln("1. Move");
		Console.logln("2. Change active main soldier");
		String modeKey = Console.promtString("Choose action option: ");

		
		if(modeKey.equals(GamePlayStatus.MOVE_OPTION)) {
			String actionKey = Console.promtString("Choose squad direction: ");
			if(KeyManager.isDirectionKey(actionKey)) {
				new SquadManager().processActionMove(actionKey);
			}
		}
		if(modeKey.equals(GamePlayStatus.CHANGE_MAIN_SOLDIER)) {
			Console.logln("Squad options: 1(Tank), 2(Sniper), 3(Spy), 4(Wrecker)");
			int choosenSoldier = Console.promtInt("Choose new main active soldier: ");
			if(KeyManager.isSoldierKeyOption(choosenSoldier)) {
				new SquadManager().changeMainSoldierPosition(choosenSoldier);
			}
		}
		
		Console.logln("");
		Console.logln("");
		this.render();
		loadGamePlay();
	}
	
	
	

}
