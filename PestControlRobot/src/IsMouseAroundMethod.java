public class IsMouseAroundMethod {
	
	private static int mouseIsHit = 0;
	private static final int MAXIMUM_HITS_TO_MOUSE 	= 4;
	
	
	public static void mouseCheck() {
		
		boolean mouseInFront = DetectMouseMethod.mouseDetect();
		
			if (mouseInFront == true) 
			{	
			mouseIsHit ++;
			mouseHitAndBatteryLogic();	
			}
		
			if (mouseInFront == false) 
			{
			ConsoleMethods.print("No mouse in front!");	
			ChosenObjectMethod.printChoosenOptions();
			}					
		}


	private static void mouseHitAndBatteryLogic() {
		
		boolean mouseHitStatus = MouseHitMethod.mouseHit();					
			if (mouseHitStatus == true) 
			{
			robotMakeHit();
			
			}
		else if(mouseHitStatus == false)
			{
			robotMissTarget();	
			}			
	}


	private static void robotLowBattery() {
		mouseIsHit = 0;
		ConsoleMethods.print("After this hit the battery is low. Go to charge!");
		boolean isFinished = RobotCommunicationMethod.isProgramIsFinished();
		boolean isHaveAmperage = AmperageMethod.isAmperageAvailable();
		
		if(isHaveAmperage == true) {
			if(isFinished == false) {
			ConsoleMethods.print("We have amperage and the robot is charged.");		
			ChosenObjectMethod.printChoosenOptions();
			}
			ConsoleMethods.print("I finish my program.");
			System.exit(0);
		}
		if(isHaveAmperage == false) {
			ConsoleMethods.print("We do not have amperage to charge the robot.");
			robotLowBattery();
		}
		
	}


	private static void robotMissTarget() {
		ConsoleMethods.print("Have mouse in front!");
		ConsoleMethods.print("You miss the mouse and break everything around.");
		batteryStatusFunc();
	}


	private static void robotMakeHit() {		
		ConsoleMethods.print("Have mouse in front!");
		ConsoleMethods.print("You hit the mouse!");
		RobotCommunicationMethod.communicationProtocolPrint();
		batteryStatusFunc();
	}


	private static void batteryStatusFunc() {
		boolean batteryStatus = mouseIsHit < MAXIMUM_HITS_TO_MOUSE ? false : true;	
		if (batteryStatus == false) {
		ChosenObjectMethod.printChoosenOptions();
		}
		robotLowBattery();
	}
	
}
