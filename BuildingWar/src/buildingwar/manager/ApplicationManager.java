package buildingwar.manager;

import buildingwar.playground.PlayGround;

public class ApplicationManager {
	
	public void start() {
		PlayGroundManager newPlayGound = new PlayGroundManager();
		newPlayGound.bootstrap();
		
		BuildingManager newBuidings = new BuildingManager();
		newBuidings.boostrap();
		
		this.render();
	}
		
	private void render() {
		PlayGround.getInstance().render();
	}
	

}
