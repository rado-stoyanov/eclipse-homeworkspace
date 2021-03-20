public class RobotCommunicationMethod {

	private static int mouseHitParameter = 9;
	
	public static void communicationProtocolPrint() {
		//mouseHitParameter --;
			
		if (mouseHitParameter % 2 == 0) {
			//mouseHitParameter --;
			ConsoleMethods.print("I am a Robottttt. I have " + mouseHitParameter + " more hits.");
		}
		if (mouseHitParameter % 2 == 1) {
			//mouseHitParameter --;
			ConsoleMethods.print("I have " + mouseHitParameter + " more hits.");
		}		
		mouseHitParameter --;
		return;
	}
	
	public static boolean isProgramIsFinished() {		
		if (mouseHitParameter < 0) return true;
		return false;		
	}	
	
}
