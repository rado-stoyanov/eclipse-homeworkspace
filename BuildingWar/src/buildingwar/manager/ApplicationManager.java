package buildingwar.manager;

import buildingwar.contracts.GamePlayStatus;
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
		
//		String actionKey = Console.promtString("Choose squad direction: ");
//		if(KeyManager.isDirectionKey(actionKey)) {
//			new SquadManager().processActionMove(actionKey);
//		}
		////////////////////////////////////////////////////////////////////
		Console.logln("Gameplay options:");
		Console.logln("1. Move");
		Console.logln("2. Change active main Soldier");
		int modeKey = Console.promtInt("Choose mode options: ");

		
		if(modeKey == GamePlayStatus.MOVE_OPTION) {
			String actionKey = Console.promtString("Choose squad direction: ");
			if(KeyManager.isDirectionKey(actionKey)) {
				new SquadManager().processActionMove(actionKey);
			}
		}
		if(modeKey == GamePlayStatus.CHANGE_MAIN_SOLDIER) {
			Console.logln("Change options: 1(Tank), 2(Sniper), 3(Spy), 4(Wrecker)");
			int choosenSoldier = Console.promtInt("Choose soldier: ");
			if(KeyManager.isSoldierKeyOption(choosenSoldier)) {
				new SquadManager().changeMainSoldierPosition(choosenSoldier);
			}
		}
				
		////////////////////////////////////////////////////////////////////		
		Console.logln("");
		Console.logln("");
		this.render();
		loadGamePlay();
	}
	
	
	

}
